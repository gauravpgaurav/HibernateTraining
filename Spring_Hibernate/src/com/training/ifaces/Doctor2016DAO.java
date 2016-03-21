package com.training.ifaces;

import java.io.Serializable;
import java.util.*;

public interface Doctor2016DAO<T> {
	
	public Serializable add(T t);
	public T find(Serializable obj);
	public List<T> findAll();
	public T update(T obj);
	public boolean delete(Object obj);

	
}
