package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.Curve;
import com.grgbanking.electric.param.CurveQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.CurveData;


public interface ICurveService {

    /**
     * 新增
     * @param curve
     */
    void save(Curve curve);
    /**
     * 批量新增
     * @param curves
     * @return
     */
    void saveBatch(List<Curve> curves);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(CurveData data);
    
    /**
     * 修改
     * @param Curve
     */
    void update(Curve curve);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param curve
     */
    void delete(Curve curve);
    
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
    Curve getById(String id);
    
    /**
     * 多条件查找
     * @param curve
     * @return
     */
    Curve getData(Curve curve);
    
    /**
     * 保存或修改
     * @param curve
     */
    void saveOrUpdate(Curve curve);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<Curve> query(CurveQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<Curve> queryAll(CurveQueryParam param);
}