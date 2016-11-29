package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.Terminal;
import com.grgbanking.electric.param.TerminalQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.TerminalData;


public interface ITerminalService {

    /**
     * 新增
     * @param terminal
     */
    void save(Terminal terminal);
    /**
     * 批量新增
     * @param terminals
     * @return
     */
    void saveBatch(List<Terminal> terminals);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(TerminalData data);
    
    /**
     * 修改
     * @param Terminal
     */
    void update(Terminal terminal);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param terminal
     */
    void delete(Terminal terminal);
    
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
    Terminal getById(String id);
    
    /**
     * 多条件查找
     * @param terminal
     * @return
     */
    Terminal getData(Terminal terminal);
    
    /**
     * 保存或修改
     * @param terminal
     */
    void saveOrUpdate(Terminal terminal);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<Terminal> query(TerminalQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<Terminal> queryAll(TerminalQueryParam param);
}