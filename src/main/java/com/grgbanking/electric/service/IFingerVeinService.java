package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.FingerVein;
import com.grgbanking.electric.param.FingerVeinQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.FingerVeinData;


public interface IFingerVeinService {

    /**
     * 新增
     * @param fingerVein
     */
    void save(FingerVein fingerVein);
    /**
     * 批量新增
     * @param fingerVeins
     * @return
     */
    void saveBatch(List<FingerVein> fingerVeins);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(FingerVeinData data);
    
    /**
     * 修改
     * @param FingerVein
     */
    void update(FingerVein fingerVein);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param fingerVein
     */
    void delete(FingerVein fingerVein);
    
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
    FingerVein getById(String id);
    
    /**
     * 多条件查找
     * @param fingerVein
     * @return
     */
    FingerVein getData(FingerVein fingerVein);
    
    /**
     * 保存或修改
     * @param fingerVein
     */
    void saveOrUpdate(FingerVein fingerVein);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<FingerVein> query(FingerVeinQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<FingerVein> queryAll(FingerVeinQueryParam param);
    
    /**
     * 注册指静脉
     * @param fingerVein
     */
    void register(FingerVein fingerVein);
    
    /**
     * 识别指静脉
     * @param fingerVein
     */
    String recognition(FingerVein fingerVein, String ipaddr);
}