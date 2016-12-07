package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.Event;
import com.grgbanking.electric.param.EventQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.EventData;


public interface IEventService {

    /**
     * 新增
     * @param event
     */
    void save(Event event);
    /**
     * 批量新增
     * @param events
     * @return
     */
    void saveBatch(List<Event> events);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(EventData data);
    
    /**
     * 修改
     * @param Event
     */
    void update(Event event);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param event
     */
    void delete(Event event);
    
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
    Event getById(String id);
    
    /**
     * 多条件查找
     * @param event
     * @return
     */
    Event getData(Event event);
    
    /**
     * 保存或修改
     * @param event
     */
    void saveOrUpdate(Event event);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<Event> query(EventQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<Event> queryAll(EventQueryParam param);
}