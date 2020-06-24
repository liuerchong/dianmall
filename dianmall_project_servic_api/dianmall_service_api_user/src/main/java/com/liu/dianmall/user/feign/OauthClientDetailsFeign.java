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
import com.liu.dianmall.user.pojo.OauthClientDetails;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@FeignClient(name="user")
@RequestMapping("/oauthClientDetails")
public interface OauthClientDetailsFeign {

    /***
     * OauthClientDetails分页条件搜索实现
     * @param oauthClientDetails
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) OauthClientDetails oauthClientDetails, @PathVariable  int page, @PathVariable  int size);

    /***
     * OauthClientDetails分页搜索实现
     * @param page:当前�?
     * @param size:每页显示多少�?
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数�?
     * @param oauthClientDetails
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<OauthClientDetails>> findList(@RequestBody(required = false) OauthClientDetails oauthClientDetails);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable String id);

    /***
     * 修改OauthClientDetails数据
     * @param oauthClientDetails
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody OauthClientDetails oauthClientDetails,@PathVariable String id);

    /***
     * 新增OauthClientDetails数据
     * @param oauthClientDetails
     * @return
     */
    @PostMapping
    Result add(@RequestBody OauthClientDetails oauthClientDetails);

    /***
     * 根据ID查询OauthClientDetails数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<OauthClientDetails> findById(@PathVariable String id);

    /***
     * 查询OauthClientDetails全部数据
     * @return
     */
    @GetMapping
    Result<List<OauthClientDetails>> findAll();
}