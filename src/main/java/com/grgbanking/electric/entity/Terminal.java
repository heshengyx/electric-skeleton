package com.grgbanking.electric.entity;

import java.io.Serializable;


/**
 * Terminal
 * @author hsheng1
 *
 */
public class Terminal extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private String name;
	private String code;
	private String orgId;
	private String styleId;

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public String getStyleId() {
		return styleId;
	}

}