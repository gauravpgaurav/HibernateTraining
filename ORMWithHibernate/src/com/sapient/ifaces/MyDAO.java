package com.sapient.ifaces;

import java.util.List;

public interface MyDAO<T> {

	public Object add(T t);

	public T find(Object obj);

	public List<T> findAll();

	public T update(Object obj);

	public boolean delete(Object obj);
}
