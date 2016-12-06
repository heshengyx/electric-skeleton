package com.grgbanking.electric.entity;

import java.io.Serializable;


/**
 * Permission
 * @author hsheng1
 *
 */
public class Permission extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private String name;
	private String url;
	private String parentId;

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentId() {
		return parentId;
	}

}