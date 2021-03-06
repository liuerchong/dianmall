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
import com.liu.dianmall.user.pojo.Address;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@FeignClient(name="user_service")
@RequestMapping("/address")
public interface AddressFeign {

    /***
     * Address分页条件搜索实现
     * @param address
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/api/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) Address address, @PathVariable  int page, @PathVariable  int size);

    /***
     * Address分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少行?
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数�?
     * @param address
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<Address>> findList(@RequestBody(required = false) Address address);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改Address数据
     * @param address
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody Address address,@PathVariable Integer id);

    /***
     * 新增Address数据
     * @param address
     * @return
     */
    @PostMapping
    Result add(@RequestBody Address address);

    /***
     * 根据ID查询Address数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<Address> findById(@PathVariable Integer id);

    /***
     * 查询Address全部数据
     * @return
     */
    @GetMapping
    Result<List<Address>> findAll();
}