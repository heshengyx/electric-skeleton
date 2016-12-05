package com.grgbanking.electric.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * Instantaneous
 * @author hsheng1
 *
 */
public class Instantaneous extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String terminalId;
	private Date sampleTime;
	private int forwardHas;
	private int assembleNo;
	private int reverseHas;
	private int assembleReverseNo;
	private int assembleHas;
	private int degree;
	
	private String terminalCode;

	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}
	public Date getSampleTime() {
		return sampleTime;
	}
	public void setForwardHas(int forwardHas) {
		this.forwardHas = forwardHas;
	}
	public int getForwardHas() {
		return forwardHas;
	}
	public void setAssembleNo(int assembleNo) {
		this.assembleNo = assembleNo;
	}
	public int getAssembleNo() {
		return assembleNo;
	}
	public void setReverseHas(int reverseHas) {
		this.reverseHas = reverseHas;
	}
	public int getReverseHas() {
		return reverseHas;
	}
	public void setAssembleReverseNo(int assembleReverseNo) {
		this.assembleReverseNo = assembleReverseNo;
	}
	public int getAssembleReverseNo() {
		return assembleReverseNo;
	}
	public void setAssembleHas(int assembleHas) {
		this.assembleHas = assembleHas;
	}
	public int getAssembleHas() {
		return assembleHas;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public int getDegree() {
		return degree;
	}

}