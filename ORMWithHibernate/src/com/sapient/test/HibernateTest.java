package com.sapient.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.sapient.daos.DoctorDAO;
import com.sapient.entity.Address;
import com.sapient.entity.Doctor;

public class HibernateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void testAdd() {
		Address add1 = new Address("124", "Sector 21", "Delhi", 110001);
		Address add2 = new Address("500", "Rohini", "Old Delhi", 110006);

		Doctor doc1 = new Doctor(103, "Ganesh", 99898934, add1, add2);
		DoctorDAO dao = new DoctorDAO();
		int result = (int) dao.add(doc1);
		System.out.println(result);
	}

	@Ignore
	@Test
	public void testFind() {

		DoctorDAO dao = new DoctorDAO();
		Doctor result = dao.find(102);
		System.out.println(result);

	}

	@Test
	public void testFindAll() {

		try {
			DoctorDAO dao = new DoctorDAO();
			List<Doctor> docList = dao.findAll();

			for (Doctor doc : docList) {
				System.out.println(doc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {

		try {
			DoctorDAO dao = new DoctorDAO();
			dao.delete(102);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {

		try {
			DoctorDAO dao = new DoctorDAO();
			Address add1 = new Address("124", "Sector 21", "Delhi", 110001);
			Address add2 = new Address("500", "Rohini", "Old Delhi", 110006);
			Doctor doc = new Doctor(103, "Suresh", 123456789, add1, add2);

			doc = dao.update(doc);

			System.out.println(doc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
