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
	public Serializable add(Doctor doc) {

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
	public Doctor find(Serializable obj) {

		factory = HiberUtils.getFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		Doctor doc = (Doctor) session.get(Doctor.class, (int) obj);
		tx.commit();
		factory.close();

		return doc;
	}

	@Override
	public List<Doctor> findAll() {
		factory = HiberUtils.getFactory();
		session = factory.openSession();

		@SuppressWarnings("unchecked")
		List<Doctor> docList = session.createQuery("from Doctor").list();

		session.close();
		factory.close();

		return docList;
	}

	@Override
	public Doctor update(Doctor obj) {

		factory = HiberUtils.getFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
		factory.close();

		return obj;
	}

	@Override
	public boolean delete(Serializable obj) {

		factory = HiberUtils.getFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		session.delete((Doctor) session.get(Doctor.class, (Integer) obj));
		tx.commit();
		session.close();
		factory.close();

		return true;
	}

}
