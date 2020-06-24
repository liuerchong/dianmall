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
import com.liu.dianmall.user.pojo.Cities;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@FeignClient(name="user_service")
@RequestMapping("/cities")
public interface CitiesFeign {

    /***
     * Cities分页条件搜索实现
     * @param cities
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) Cities cities, @PathVariable  int page, @PathVariable  int size);

    /***
     * Cities分页搜索实现
     * @param page:当前�?
     * @param size:每页显示多少�?
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数�?
     * @param cities
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<Cities>> findList(@RequestBody(required = false) Cities cities);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable String id);

    /***
     * 修改Cities数据
     * @param cities
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody Cities cities,@PathVariable String id);

    /***
     * 新增Cities数据
     * @param cities
     * @return
     */
    @PostMapping
    Result add(@RequestBody Cities cities);

    /***
     * 根据ID查询Cities数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<Cities> findById(@PathVariable String id);

    /***
     * 查询Cities全部数据
     * @return
     */
    @GetMapping
    Result<List<Cities>> findAll();
}