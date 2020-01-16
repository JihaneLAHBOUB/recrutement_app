package com.everis.recrutement.service;

import java.util.List;

public interface GenericService<T, K> {
	
	T create(T t);
	T update(T t);
	void delete(T t);
	T getById(K k);
	List<T> getAll();

}
