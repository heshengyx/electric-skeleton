package com.grgbanking.electric.param;

import java.io.Serializable;

public class OrganizationQueryParam extends QueryParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String code;
	private String parentId;
	private String createDateBegin;
	private String createDateEnd;
	
	private String terminalFlag;

	public String getTerminalFlag() {
		return terminalFlag;
	}
	public void setTerminalFlag(String terminalFlag) {
		this.terminalFlag = terminalFlag;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreateDateBegin() {
		return createDateBegin;
	}
	public void setCreateDateBegin(String createDateBegin) {
		this.createDateBegin = createDateBegin;
	}
	public String getCreateDateEnd() {
		return createDateEnd;
	}
	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
