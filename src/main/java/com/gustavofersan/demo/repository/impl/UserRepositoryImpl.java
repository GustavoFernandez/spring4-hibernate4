package com.gustavofersan.demo.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.gustavofersan.demo.entity.User;
import com.gustavofersan.demo.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private static Logger logger = Logger.getLogger(UserRepositoryImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<User> findAll() {
		logger.info("UserRepositoryImpl.findAll()");
		List<User> resultList = entityManager.createQuery("select u from User u", User.class).getResultList();
		return resultList;
	}

}
