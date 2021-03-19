package com.juaracoding.secondexam;

import java.time.LocalDate;

public class InstallmentTable {
	
	private int seqNo;
	
	private LocalDate dueDate;
	
	private double installmentAmt;
	
	private double principalAmt;
	
	private double interest;
	
	private double OSPrincipalAmt;
	
	public InstallmentTable() {
		
	}

	public InstallmentTable(int seqNo, LocalDate dueDate,  double installmentAmt, double principalAmt, double interest, double OSPrincipalAmt) {
		this.setSeqNo(seqNo);
		this.setDueDate(dueDate);
		this.setInstallmentAmt(installmentAmt);
		this.setPrincipalAmt(principalAmt);
		this.setInterest(interest);
		this.setOSPrincipalAmt(OSPrincipalAmt);
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public double getInstallmentAmt() {
		return installmentAmt;
	}

	public void setInstallmentAmt(double installmentAmt) {
		this.installmentAmt = installmentAmt;
	}

	public double getPrincipalAmt() {
		return principalAmt;
	}

	public void setPrincipalAmt(double principalAmt) {
		this.principalAmt = principalAmt;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getOSPrincipalAmt() {
		return OSPrincipalAmt;
	}

	public void setOSPrincipalAmt(double oSPrincipalAmt) {
		OSPrincipalAmt = oSPrincipalAmt;
	}
}
