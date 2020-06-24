package com.liu.dianmall.user.feign;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.liu.dianmall.common.basic.Result;
import com.liu.dianmall.user.pojo.UndoLog;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@FeignClient(name="user_service")
@RequestMapping("/undoLog")
public interface UndoLogFeign {

    /***
     * UndoLog分页条件搜索实现
     * @param undoLog
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) UndoLog undoLog, @PathVariable  int page, @PathVariable  int size);

    /***
     * UndoLog分页搜索实现
     * @param page:当前�?
     * @param size:每页显示多少�?
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数�?
     * @param undoLog
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<UndoLog>> findList(@RequestBody(required = false) UndoLog undoLog);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Long id);

    /***
     * 修改UndoLog数据
     * @param undoLog
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody UndoLog undoLog,@PathVariable Long id);

    /***
     * 新增UndoLog数据
     * @param undoLog
     * @return
     */
    @PostMapping
    Result add(@RequestBody UndoLog undoLog);

    /***
     * 根据ID查询UndoLog数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<UndoLog> findById(@PathVariable Long id);

    /***
     * 查询UndoLog全部数据
     * @return
     */
    @GetMapping
    Result<List<UndoLog>> findAll();
}