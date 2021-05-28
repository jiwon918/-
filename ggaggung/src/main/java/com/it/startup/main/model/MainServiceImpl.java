package com.it.startup.main.model;

import org.springframework.beans.factory.annotation.Autowired;

public class MainServiceImpl implements MainService{

	@Autowired
	private MainDAO mainDao;
}
