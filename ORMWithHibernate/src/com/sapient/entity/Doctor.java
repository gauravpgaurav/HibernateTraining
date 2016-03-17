package com.sapient.entity;

import java.io.Serializable;

public class Doctor implements Serializable {

	private int doctorCode;

	private String doctorName;

	private long handPhone;

	private Address residenceAddress;

	private Address workAddress;

	// ZERO Argument Constructor
	public Doctor() {
		super();
	}

	public Doctor(int doctorCode, String doctorName, long handPhone, Address residenceAddress, Address workAddress) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.residenceAddress = residenceAddress;
		this.workAddress = workAddress;
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

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", residenceAddress=" + residenceAddress + ", workAddress=" + workAddress + "]";
	}

}
