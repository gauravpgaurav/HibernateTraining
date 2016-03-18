package com.sapient.apps;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.*;

import com.sapient.entity.InPatient;
import com.sapient.utils.HiberUtils;

public class InheritanceApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Timestamp date = new Timestamp(new Date().getTime());
		InPatient patient = new InPatient("101", "Gaurav", "Male", 21, 12, date);
		session.save(patient);
		
		tx.commit();
		System.out.println("Added One Patient !");
	}

}
