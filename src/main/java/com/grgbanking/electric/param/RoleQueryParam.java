package com.grgbanking.electric.param;

import java.io.Serializable;


public class RoleQueryParam extends QueryParam implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;
    private String createDateBegin;
	private String createDateEnd;
    
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
}