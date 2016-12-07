package com.grgbanking.electric.data;

import java.io.Serializable;


/**
 * UserRole
 * @author hsheng1
 *
 */
public class UserRoleData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	
	private String createBy;
	
	
	public String getCreateBy() {
        return createBy;
    }
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}