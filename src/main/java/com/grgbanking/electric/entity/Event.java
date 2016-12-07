package com.grgbanking.electric.entity;

import java.io.Serializable;


/**
 * Event
 * @author hsheng1
 *
 */
public class Event extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private String name;
	private String code;
	private String paramValue;
	private String equipmentCode;
	private String alarmCode;
	private String accidentReason;
	private int sampleType;
	private String dealStatus;
	private String terminalId;
	private String terminalCode;
	
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
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
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}
	public String getEquipmentCode() {
		return equipmentCode;
	}
	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}
	public String getAlarmCode() {
		return alarmCode;
	}
	public void setAccidentReason(String accidentReason) {
		this.accidentReason = accidentReason;
	}
	public String getAccidentReason() {
		return accidentReason;
	}
	public void setSampleType(int sampleType) {
		this.sampleType = sampleType;
	}
	public int getSampleType() {
		return sampleType;
	}
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}
	public String getDealStatus() {
		return dealStatus;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalId() {
		return terminalId;
	}

}