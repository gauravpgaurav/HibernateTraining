package com.training.entity;

public class Doctor {
	
	private int docCode;
	private String docName;
	private long handPhone;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getDocCode() {
		return docCode;
	}


	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}


	public String getDocName() {
		return docName;
	}


	public void setDocName(String docName) {
		this.docName = docName;
	}


	public long getHandPhone() {
		return handPhone;
	}


	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}


	@Override
	public String toString() {
		return "Doctor [docCode=" + docCode + ", docName=" + docName + ", handPhone=" + handPhone + "]";
	}


	public Doctor(int docCode, String docName, long handPhone) {
		super();
		this.docCode = docCode;
		this.docName = docName;
		this.handPhone = handPhone;
	}
	
	
	
	

}
