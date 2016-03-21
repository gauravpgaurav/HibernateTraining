package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Doctor;
import com.training.ifaces.DoctorDAO;

public class HiberSpringExample extends HibernateDaoSupport implements DoctorDAO<Doctor> {

	@Override
	public Serializable add(Doctor t) {
		Serializable key=getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Doctor find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor update(Doctor obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
