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

		Doctor doc1 = new Doctor(102, "Suresh", 99898934, add2, add1);
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
}
