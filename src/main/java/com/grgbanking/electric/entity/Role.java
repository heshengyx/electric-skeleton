package com.grgbanking.electric.entity;

import java.io.Serializable;


/**
 * 角色
 * @author hsheng1
 *
 */
public class Role extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
