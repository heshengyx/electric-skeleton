package com.grgbanking.electric.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * FreezeDay
 * @author hsheng1
 *
 */
public class FreezeDay extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private Date sampleTime;
	private int assembleTotals;
	private int forwardHas;
	private int forwardNo;
	private int reverseHas;
	private int reverseNo;
	private int totals;
	private int forwardHasDay;
	private int forwardNoDay;
	private int reverseHasDay;
	private int reverseNoDay;
	private int peakTotals;
	private int flatTotals;
	private int valleyTotals;
	private int tipTotals;
	private int morningTotals;
	private int middayTotals;
	private int nightTotals;
	private String terminalId;
	private String terminalCode;
	
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
	public void setAssembleTotals(int assembleTotals) {
		this.assembleTotals = assembleTotals;
	}
	public int getAssembleTotals() {
		return assembleTotals;
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
	public void setReverseNo(int reverseNo) {
		this.reverseNo = reverseNo;
	}
	public int getReverseNo() {
		return reverseNo;
	}
	public void setTotals(int totals) {
		this.totals = totals;
	}
	public int getTotals() {
		return totals;
	}
	public void setForwardHasDay(int forwardHasDay) {
		this.forwardHasDay = forwardHasDay;
	}
	public int getForwardHasDay() {
		return forwardHasDay;
	}
	public void setForwardNoDay(int forwardNoDay) {
		this.forwardNoDay = forwardNoDay;
	}
	public int getForwardNoDay() {
		return forwardNoDay;
	}
	public void setReverseHasDay(int reverseHasDay) {
		this.reverseHasDay = reverseHasDay;
	}
	public int getReverseHasDay() {
		return reverseHasDay;
	}
	public void setReverseNoDay(int reverseNoDay) {
		this.reverseNoDay = reverseNoDay;
	}
	public int getReverseNoDay() {
		return reverseNoDay;
	}
	public void setPeakTotals(int peakTotals) {
		this.peakTotals = peakTotals;
	}
	public int getPeakTotals() {
		return peakTotals;
	}
	public void setFlatTotals(int flatTotals) {
		this.flatTotals = flatTotals;
	}
	public int getFlatTotals() {
		return flatTotals;
	}
	public void setValleyTotals(int valleyTotals) {
		this.valleyTotals = valleyTotals;
	}
	public int getValleyTotals() {
		return valleyTotals;
	}
	public void setTipTotals(int tipTotals) {
		this.tipTotals = tipTotals;
	}
	public int getTipTotals() {
		return tipTotals;
	}
	public void setMorningTotals(int morningTotals) {
		this.morningTotals = morningTotals;
	}
	public int getMorningTotals() {
		return morningTotals;
	}
	public void setMiddayTotals(int middayTotals) {
		this.middayTotals = middayTotals;
	}
	public int getMiddayTotals() {
		return middayTotals;
	}
	public void setNightTotals(int nightTotals) {
		this.nightTotals = nightTotals;
	}
	public int getNightTotals() {
		return nightTotals;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalId() {
		return terminalId;
	}

}