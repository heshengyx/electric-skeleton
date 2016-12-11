package com.grgbanking.electric.data;

import java.io.Serializable;


/**
 * RecognitionLog
 * @author hsheng1
 *
 */
public class RecognitionLogData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private String ipaddr;
	private String status;
	private int total;
	private String createBy;
	
	public String getIpaddr() {
		return ipaddr;
	}
	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCreateBy() {
        return createBy;
    }
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}