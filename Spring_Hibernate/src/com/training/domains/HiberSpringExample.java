package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Doctor2016;
import com.training.ifaces.Doctor2016DAO;

public class HiberSpringExample extends HibernateDaoSupport implements Doctor2016DAO<Doctor2016> {

	@Override
	public Serializable add(Doctor2016 t) {
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Doctor2016 find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor2016> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor2016 update(Doctor2016 obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
