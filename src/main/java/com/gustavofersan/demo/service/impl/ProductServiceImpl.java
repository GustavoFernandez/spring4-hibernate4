package com.gustavofersan.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavofersan.demo.entity.User;
import com.gustavofersan.demo.repository.UserRepository;
import com.gustavofersan.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
