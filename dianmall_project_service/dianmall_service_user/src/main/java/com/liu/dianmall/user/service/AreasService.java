package com.liu.dianmall.user.service;
import com.liu.dianmall.user.pojo.Areas;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
public interface AreasService {

    /***
     * Areas多条件分页查�?
     * @param areas
     * @param page
     * @param size
     * @return
     */
    PageInfo<Areas> findPage(Areas areas, int page, int size);

    /***
     * Areas分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Areas> findPage(int page, int size);

    /***
     * Areas多条件搜索方�?
     * @param areas
     * @return
     */
    List<Areas> findList(Areas areas);

    /***
     * 删除Areas
     * @param id
     */
    void delete(String id);

    /***
     * 修改Areas数据
     * @param areas
     */
    void update(Areas areas);

    /***
     * 新增Areas
     * @param areas
     */
    void add(Areas areas);

    /**
     * 根据ID查询Areas
     * @param id
     * @return
     */
     Areas findById(String id);

    /***
     * 查询�?�?Areas
     * @return
     */
    List<Areas> findAll();
}
