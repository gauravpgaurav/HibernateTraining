package com.sapient.entity;

public class Patient {

	private String patientId;
	private String patientName;
	private String patientGender;
	private int patientAge;

	public Patient() {
		super();
	}

	public Patient(String patientId, String patientName, String patientGender, int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientGender = patientGender;
		this.patientAge = patientAge;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientGender=" + patientGender
				+ ", patientAge=" + patientAge + "]";
	}

	public int calculate() {
		return 150;
	}
}
