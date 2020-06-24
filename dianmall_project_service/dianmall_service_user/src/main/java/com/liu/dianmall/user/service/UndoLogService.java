package com.liu.dianmall.user.service;
import com.liu.dianmall.user.pojo.UndoLog;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
public interface UndoLogService {

    /***
     * UndoLog多条件分页查�?
     * @param undoLog
     * @param page
     * @param size
     * @return
     */
    PageInfo<UndoLog> findPage(UndoLog undoLog, int page, int size);

    /***
     * UndoLog分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<UndoLog> findPage(int page, int size);

    /***
     * UndoLog多条件搜索方�?
     * @param undoLog
     * @return
     */
    List<UndoLog> findList(UndoLog undoLog);

    /***
     * 删除UndoLog
     * @param id
     */
    void delete(Long id);

    /***
     * 修改UndoLog数据
     * @param undoLog
     */
    void update(UndoLog undoLog);

    /***
     * 新增UndoLog
     * @param undoLog
     */
    void add(UndoLog undoLog);

    /**
     * 根据ID查询UndoLog
     * @param id
     * @return
     */
     UndoLog findById(Long id);

    /***
     * 查询�?�?UndoLog
     * @return
     */
    List<UndoLog> findAll();
}
