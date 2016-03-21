package com.training.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Doctor2016 implements Serializable {

	private int doctorCode;

	private String doctorName;

	private long handPhone;

	// ZERO Argument Constructor
	public Doctor2016() {
		super();
	}

	public Doctor2016(int doctorCode, String doctorName, long handPhone) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
	}

	public int getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone + "]";
	}

}
