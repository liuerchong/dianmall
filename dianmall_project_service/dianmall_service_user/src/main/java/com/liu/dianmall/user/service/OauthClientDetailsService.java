package com.liu.dianmall.user.service;
import com.liu.dianmall.user.pojo.OauthClientDetails;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
public interface OauthClientDetailsService {

    /***
     * OauthClientDetails多条件分页查�?
     * @param oauthClientDetails
     * @param page
     * @param size
     * @return
     */
    PageInfo<OauthClientDetails> findPage(OauthClientDetails oauthClientDetails, int page, int size);

    /***
     * OauthClientDetails分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<OauthClientDetails> findPage(int page, int size);

    /***
     * OauthClientDetails多条件搜索方�?
     * @param oauthClientDetails
     * @return
     */
    List<OauthClientDetails> findList(OauthClientDetails oauthClientDetails);

    /***
     * 删除OauthClientDetails
     * @param id
     */
    void delete(String id);

    /***
     * 修改OauthClientDetails数据
     * @param oauthClientDetails
     */
    void update(OauthClientDetails oauthClientDetails);

    /***
     * 新增OauthClientDetails
     * @param oauthClientDetails
     */
    void add(OauthClientDetails oauthClientDetails);

    /**
     * 根据ID查询OauthClientDetails
     * @param id
     * @return
     */
     OauthClientDetails findById(String id);

    /***
     * 查询�?�?OauthClientDetails
     * @return
     */
    List<OauthClientDetails> findAll();
}
