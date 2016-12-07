package com.grgbanking.electric.service;

import java.util.List;

import com.grgbanking.electric.param.OrganizationQueryParam;
import com.grgbanking.electric.param.PermissionQueryParam;
import com.grgbanking.electric.param.RoleQueryParam;
import com.grgbanking.electric.tree.Tree;

public interface ITreeService {

	/**
	 * 机构树
	 * @param param
	 * @return
	 */
	List<Tree> treeOrganization(OrganizationQueryParam param);
	
	/**
	 * 权限树
	 * @param param
	 * @return
	 */
	List<Tree> treePermission(PermissionQueryParam param);
	
	/**
	 * 角色树
	 * @param param
	 * @return
	 */
	List<Tree> treeRole(RoleQueryParam param);
}
