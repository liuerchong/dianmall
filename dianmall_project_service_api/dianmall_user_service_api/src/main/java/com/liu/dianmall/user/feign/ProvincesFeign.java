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
import com.liu.dianmall.user.pojo.Provinces;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@FeignClient(name="user_service")
@RequestMapping("/provinces")
public interface ProvincesFeign {

    /***
     * Provinces分页条件搜索实现
     * @param provinces
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) Provinces provinces, @PathVariable  int page, @PathVariable  int size);

    /***
     * Provinces分页搜索实现
     * @param page:当前�?
     * @param size:每页显示多少�?
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数�?
     * @param provinces
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<Provinces>> findList(@RequestBody(required = false) Provinces provinces);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable String id);

    /***
     * 修改Provinces数据
     * @param provinces
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody Provinces provinces,@PathVariable String id);

    /***
     * 新增Provinces数据
     * @param provinces
     * @return
     */
    @PostMapping
    Result add(@RequestBody Provinces provinces);

    /***
     * 根据ID查询Provinces数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<Provinces> findById(@PathVariable String id);

    /***
     * 查询Provinces全部数据
     * @return
     */
    @GetMapping
    Result<List<Provinces>> findAll();
}