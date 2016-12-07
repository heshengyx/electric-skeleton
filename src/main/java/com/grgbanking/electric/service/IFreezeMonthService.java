package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.FreezeMonth;
import com.grgbanking.electric.param.FreezeMonthQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.FreezeMonthData;


public interface IFreezeMonthService {

    /**
     * 新增
     * @param freezeMonth
     */
    void save(FreezeMonth freezeMonth);
    /**
     * 批量新增
     * @param freezeMonths
     * @return
     */
    void saveBatch(List<FreezeMonth> freezeMonths);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(FreezeMonthData data);
    
    /**
     * 修改
     * @param FreezeMonth
     */
    void update(FreezeMonth freezeMonth);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param freezeMonth
     */
    void delete(FreezeMonth freezeMonth);
    
    /**
     * 根据ID批量删除
     * @param id
     */
    void deleteByIds(List<String> ids);
    
    /**
     * 根据ID查找
     * @param id
     * @return
     */
    FreezeMonth getById(String id);
    
    /**
     * 多条件查找
     * @param freezeMonth
     * @return
     */
    FreezeMonth getData(FreezeMonth freezeMonth);
    
    /**
     * 保存或修改
     * @param freezeMonth
     */
    void saveOrUpdate(FreezeMonth freezeMonth);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<FreezeMonth> query(FreezeMonthQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<FreezeMonth> queryAll(FreezeMonthQueryParam param);
}