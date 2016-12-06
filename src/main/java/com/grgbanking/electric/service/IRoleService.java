package com.grgbanking.electric.service;

import java.util.List;
import com.grgbanking.electric.entity.Role;
import com.grgbanking.electric.param.RoleQueryParam;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.data.RoleData;


public interface IRoleService {

    /**
     * 新增
     * @param role
     */
    void save(Role role);
    /**
     * 批量新增
     * @param roles
     * @return
     */
    void saveBatch(List<Role> roles);
    /**
     * 批量新增
     * @param data
     * @return
     */
    void saveBatchData(RoleData data);
    
    /**
     * 修改
     * @param Role
     */
    void update(Role role);
    
    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
    
    /**
     * 多条件删除
     * @param role
     */
    void delete(Role role);
    
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
    Role getById(String id);
    
    /**
     * 多条件查找
     * @param role
     * @return
     */
    Role getData(Role role);
    
    /**
     * 保存或修改
     * @param role
     */
    void saveOrUpdate(Role role);
    
    /**
     * 查询分页
     * @param param
     * @return
     */
    IPage<Role> query(RoleQueryParam param);
    
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<Role> queryAll(RoleQueryParam param);
}