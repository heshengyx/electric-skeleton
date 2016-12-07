package com.grgbanking.electric.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * Curve
 * @author hsheng1
 *
 */
public class Curve extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private Date sampleTime;
	private int assembleHas;
	private int assembleNo;
	private int totals;
	private int forwardHas;
	private int forwardNo;
	private int reverseHas;
	private int reverseNo;
	private String terminalId;
	private String terminalCode;

	public int getReverseNo() {
		return reverseNo;
	}
	public void setReverseNo(int reverseNo) {
		this.reverseNo = reverseNo;
	}
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}
	public Date getSampleTime() {
		return sampleTime;
	}
	public void setAssembleHas(int assembleHas) {
		this.assembleHas = assembleHas;
	}
	public int getAssembleHas() {
		return assembleHas;
	}
	public void setAssembleNo(int assembleNo) {
		this.assembleNo = assembleNo;
	}
	public int getAssembleNo() {
		return assembleNo;
	}
	public void setTotals(int totals) {
		this.totals = totals;
	}
	public int getTotals() {
		return totals;
	}
	public void setForwardHas(int forwardHas) {
		this.forwardHas = forwardHas;
	}
	public int getForwardHas() {
		return forwardHas;
	}
	public void setForwardNo(int forwardNo) {
		this.forwardNo = forwardNo;
	}
	public int getForwardNo() {
		return forwardNo;
	}
	public void setReverseHas(int reverseHas) {
		this.reverseHas = reverseHas;
	}
	public int getReverseHas() {
		return reverseHas;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalId() {
		return terminalId;
	}

}