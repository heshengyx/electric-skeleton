package com.grgbanking.electric.service;

import java.util.List;

import com.grgbanking.electric.data.OrganizationData;
import com.grgbanking.electric.entity.Organization;
import com.grgbanking.electric.page.IPage;
import com.grgbanking.electric.param.OrganizationQueryParam;
import com.grgbanking.electric.tree.Tree;

public interface IOrganizationService {

	/**
	 * 新增
	 * @param organization
	 */
	void save(Organization organization);
	/**
	 * 批量新增
	 * @param organizations
	 * @return
	 */
	void saveBatch(List<Organization> organizations);
	/**
	 * 批量新增
	 * @param data
	 * @return
	 */
	void saveBatchData(OrganizationData data);
	
	/**
	 * 修改
	 * @param organization
	 */
	void update(Organization organization);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void deleteById(String id);
	
	/**
	 * 多条件删除
	 * @param organization
	 */
	void delete(Organization organization);
	
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
	Organization getById(String id);
	
	/**
	 * 多条件查找
	 * @param organization
	 * @return
	 */
	Organization getData(Organization organization);
	
	/**
	 * 保存或修改
	 * @param organization
	 */
	void saveOrUpdate(Organization organization);
	
	/**
	 * 分页查询
	 * @param param
	 * @param page
	 * @param rows
	 * @return
	 */
	IPage<Organization> query(OrganizationQueryParam param);
	
	/**
	 * 机构树
	 * @param organization
	 * @return
	 */
	List<Tree> tree(OrganizationQueryParam param);
}