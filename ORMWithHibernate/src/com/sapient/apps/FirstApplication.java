package com.sapient.apps;

import org.hibernate.*;

import com.sapient.entity.Doctor;
import com.sapient.utils.HiberUtils;

public class FirstApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Doctor doc1 = new Doctor(103, "Ganesh", 99898934);

		Integer key = (Integer) session.save(doc1);

		System.out.println("KEY : " + key);

		Doctor doc2 = (Doctor) session.get(Doctor.class, 101);

		System.out.println("DOC2 : " + doc2);
		
		tx.commit();

		factory.close();
	}

}
