package com.sapient.apps;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.*;

import com.sapient.entity.InPatient;
import com.sapient.entity.Patient;
import com.sapient.utils.HiberUtils;

public class InheritanceApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Timestamp date = new Timestamp(new Date().getTime());
		InPatient patient = new InPatient("103", "Gaurav", "Male", 21, 12, date);
		Patient patient2 = new Patient("102", "Sauravi", "Female", 30);

		// session.save(patient);
		// session.save(patient2);

		Patient pat1 = (Patient) session.get(Patient.class, patient.getPatientId());
		Patient pat2 = (Patient) session.get(Patient.class, patient2.getPatientId());

		System.out.println(pat1.calculate());
		System.out.println(pat2.calculate());

		tx.commit();
		System.out.println("Added One Patient !");
	}

}
