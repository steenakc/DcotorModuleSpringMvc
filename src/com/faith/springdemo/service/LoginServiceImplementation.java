package com.faith.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.springdemo.entity.Staff;
import com.faith.springdemo.repository.LoginDao;

@Service
public class LoginServiceImplementation implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public Staff getStaff(String userName, String password) {
		return loginDao.getStaff(userName, password);
	}

}
