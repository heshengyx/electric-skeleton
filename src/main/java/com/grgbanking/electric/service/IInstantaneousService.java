package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.Instantaneous;
import com.grgbanking.electric.param.InstantaneousQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.InstantaneousData;


public interface IInstantaneousService {

    /**
     * 新增
     * @param instantaneous
     */
    void save(Instantaneous instantaneous);
    /**
     * 批量新增
     * @param instantaneouss
     * @return
     */
    void saveBatch(List<Instantaneous> instantaneouss);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(InstantaneousData data);
    
    /**
     * 修改
     * @param Instantaneous
     */
    void update(Instantaneous instantaneous);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param instantaneous
     */
    void delete(Instantaneous instantaneous);
    
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
    Instantaneous getById(String id);
    
    /**
     * 多条件查找
     * @param instantaneous
     * @return
     */
    Instantaneous getData(Instantaneous instantaneous);
    
    /**
     * 保存或修改
     * @param instantaneous
     */
    void saveOrUpdate(Instantaneous instantaneous);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<Instantaneous> query(InstantaneousQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<Instantaneous> queryAll(InstantaneousQueryParam param);
}