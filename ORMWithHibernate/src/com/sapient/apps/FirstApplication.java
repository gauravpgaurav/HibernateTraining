package com.sapient.apps;

import org.hibernate.*;

import com.sapient.entity.Address;
import com.sapient.entity.Doctor;
import com.sapient.utils.HiberUtils;

public class FirstApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Address add1 = new Address("124", "Sector 21", "Delhi", 110001);
		Address add2 = new Address("500", "Rohini", "Old Delhi", 110006);

		Doctor doc1 = new Doctor(102, "Suresh", 99898934, add2, add1);

		Integer key = (Integer) session.save(doc1);

		System.out.println("KEY : " + key);

		Doctor doc2 = (Doctor) session.get(Doctor.class, 101);

		System.out.println("DOC2 : " + doc2);

		tx.commit();

		factory.close();
	}

}
