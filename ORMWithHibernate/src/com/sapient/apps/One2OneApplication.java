package com.sapient.apps;

import org.hibernate.*;

import com.sapient.entity.*;
import com.sapient.utils.HiberUtils;

public class One2OneApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		Address add1 = new Address("124", "Sector 21", "Delhi", 110001);
		Address add2 = new Address("500", "Rohini", "Old Delhi", 110006);

		Doctor doc1 = new Doctor(102, "Suresh", 99898934, add2, add1);
		ClinicalAssistant assistant = new ClinicalAssistant(123, "XYZ");

		doc1.setAssistant(assistant);
		session.save(doc1);
		session.save(assistant);
		tx.commit();
		session.close();
		factory.close();
	}

}
