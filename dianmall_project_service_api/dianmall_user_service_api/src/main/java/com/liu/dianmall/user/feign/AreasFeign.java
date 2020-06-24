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
import com.liu.dianmall.user.pojo.Areas;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@FeignClient(name="user_service")
@RequestMapping("/areas")
public interface AreasFeign {

    /***
     * Areas分页条件搜索实现
     * @param areas
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) Areas areas, @PathVariable  int page, @PathVariable  int size);

    /***
     * Areas分页搜索实现
     * @param page:当前�?
     * @param size:每页显示多少�?
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数�?
     * @param areas
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<Areas>> findList(@RequestBody(required = false) Areas areas);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable String id);

    /***
     * 修改Areas数据
     * @param areas
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody Areas areas,@PathVariable String id);

    /***
     * 新增Areas数据
     * @param areas
     * @return
     */
    @PostMapping
    Result add(@RequestBody Areas areas);

    /***
     * 根据ID查询Areas数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<Areas> findById(@PathVariable String id);

    /***
     * 查询Areas全部数据
     * @return
     */
    @GetMapping
    Result<List<Areas>> findAll();
}