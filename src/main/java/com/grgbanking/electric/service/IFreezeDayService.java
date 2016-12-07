package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.FreezeDay;
import com.grgbanking.electric.param.FreezeDayQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.FreezeDayData;


public interface IFreezeDayService {

    /**
     * 新增
     * @param freezeDay
     */
    void save(FreezeDay freezeDay);
    /**
     * 批量新增
     * @param freezeDays
     * @return
     */
    void saveBatch(List<FreezeDay> freezeDays);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(FreezeDayData data);
    
    /**
     * 修改
     * @param FreezeDay
     */
    void update(FreezeDay freezeDay);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param freezeDay
     */
    void delete(FreezeDay freezeDay);
    
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
    FreezeDay getById(String id);
    
    /**
     * 多条件查找
     * @param freezeDay
     * @return
     */
    FreezeDay getData(FreezeDay freezeDay);
    
    /**
     * 保存或修改
     * @param freezeDay
     */
    void saveOrUpdate(FreezeDay freezeDay);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<FreezeDay> query(FreezeDayQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<FreezeDay> queryAll(FreezeDayQueryParam param);
}