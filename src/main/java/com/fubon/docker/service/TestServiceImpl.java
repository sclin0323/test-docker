package com.fubon.docker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{


	
	@Override
	public void show() {
		System.out.println("service...");
	}

}
