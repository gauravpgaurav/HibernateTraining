package com.sapient.apps;

import org.hibernate.*;

import com.sapient.entity.Doctor;
import com.sapient.utils.HiberUtils;

public class FirstApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Doctor doc = new Doctor(101, "Ramesh", 99898984);

		session.save(doc);

		tx.commit();

		factory.close();
	}

}
