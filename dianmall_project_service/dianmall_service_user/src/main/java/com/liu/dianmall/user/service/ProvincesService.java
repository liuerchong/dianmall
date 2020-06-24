package com.liu.dianmall.user.service;
import com.liu.dianmall.user.pojo.Provinces;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
public interface ProvincesService {

    /***
     * Provinces多条件分页查�?
     * @param provinces
     * @param page
     * @param size
     * @return
     */
    PageInfo<Provinces> findPage(Provinces provinces, int page, int size);

    /***
     * Provinces分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Provinces> findPage(int page, int size);

    /***
     * Provinces多条件搜索方�?
     * @param provinces
     * @return
     */
    List<Provinces> findList(Provinces provinces);

    /***
     * 删除Provinces
     * @param id
     */
    void delete(String id);

    /***
     * 修改Provinces数据
     * @param provinces
     */
    void update(Provinces provinces);

    /***
     * 新增Provinces
     * @param provinces
     */
    void add(Provinces provinces);

    /**
     * 根据ID查询Provinces
     * @param id
     * @return
     */
     Provinces findById(String id);

    /***
     * 查询�?�?Provinces
     * @return
     */
    List<Provinces> findAll();
}
