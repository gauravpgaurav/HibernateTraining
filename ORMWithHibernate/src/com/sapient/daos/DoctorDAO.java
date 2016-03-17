package com.sapient.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sapient.entity.Doctor;
import com.sapient.ifaces.MyDAO;
import com.sapient.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor> {

	SessionFactory factory;
	Session session;
	Transaction tx;

	@Override
	public Object add(Doctor doc) {

		Integer key = null;
		try {
			factory = HiberUtils.getFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			key = (Integer) session.save(doc);
			tx.commit();
			factory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;
	}

	@Override
	public Doctor find(Object obj) {

		factory = HiberUtils.getFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		Doctor doc = (Doctor) session.get(Doctor.class, (Serializable) obj);
		tx.commit();
		factory.close();

		return doc;
	}

	@Override
	public List<Doctor> findAll() {
		factory = HiberUtils.getFactory();
		factory.openSession();
		tx = session.beginTransaction();

		List<Doctor> docList = session.createQuery("from DOCTOR").list();
		tx.commit();
		factory.close();

		return docList;
	}

	@Override
	public Doctor update(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
