package com.grgbanking.electric.json;

/**
 * json消息
 * @author hsheng1
 *
 */
public final class JSONMessage {

	private String message;
	private boolean status;
	private Object data;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
