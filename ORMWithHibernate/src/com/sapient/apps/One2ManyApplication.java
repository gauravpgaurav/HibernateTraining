package com.sapient.apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sapient.entity.Doctor;
import com.sapient.entity.Patient;
import com.sapient.utils.HiberUtils;

public class One2ManyApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Patient pat1 = new Patient("104", "ABC", "Female", 45);
		Patient pat2 = (Patient) session.get(Patient.class, "102");
		Patient pat3 = new Patient("105", "Ramesh", "Male", 35);

		// session.save(pat1);
		// session.save(pat3);

		Set<Patient> list = new HashSet<Patient>();
		list.add(pat1);
		list.add(pat2);
		list.add(pat3);

		Doctor doc = (Doctor) session.get(Doctor.class, 103);
		doc.setPatientList(list);
		session.update(doc);

		tx.commit();
		session.close();
		factory.close();

		// System.out.println(pat1);
		// System.out.println(pat2);
		// System.out.println(pat3);
	}

}
