package com.liu.dianmall.user.service;
import com.liu.dianmall.user.pojo.Cities;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
public interface CitiesService {

    /***
     * Cities多条件分页查�?
     * @param cities
     * @param page
     * @param size
     * @return
     */
    PageInfo<Cities> findPage(Cities cities, int page, int size);

    /***
     * Cities分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Cities> findPage(int page, int size);

    /***
     * Cities多条件搜索方�?
     * @param cities
     * @return
     */
    List<Cities> findList(Cities cities);

    /***
     * 删除Cities
     * @param id
     */
    void delete(String id);

    /***
     * 修改Cities数据
     * @param cities
     */
    void update(Cities cities);

    /***
     * 新增Cities
     * @param cities
     */
    void add(Cities cities);

    /**
     * 根据ID查询Cities
     * @param id
     * @return
     */
     Cities findById(String id);

    /***
     * 查询�?�?Cities
     * @return
     */
    List<Cities> findAll();
}
