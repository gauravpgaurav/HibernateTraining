package com.sapient.entity;

import java.sql.*;

public class InPatient extends Patient {

	private int wardNumber;
	private Timestamp dateOfAdmission;

	public InPatient() {
		super();
	}

	public InPatient(String patientId, String patientName, String patientGender, int patientAge) {
		super(patientId, patientName, patientGender, patientAge);
	}

	public InPatient(String patientId, String patientName, String patientGender, int patientAge, int wardNumber,
			Timestamp dateOfAdmission) {
		super(patientId, patientName, patientGender, patientAge);
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}

	public InPatient(int wardNumber, Timestamp dateOfAdmission) {
		super();
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public Timestamp getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(Timestamp dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", dateOfAdmission=" + dateOfAdmission + "]";
	}

	@Override
	public int calculate() {
		return 15000;
	}
}
