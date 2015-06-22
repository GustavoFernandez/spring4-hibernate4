package com.gustavofersan.demo.repository;

import java.util.List;

import com.gustavofersan.demo.entity.User;

public interface UserRepository {

	public List<User> findAll();
	
}
