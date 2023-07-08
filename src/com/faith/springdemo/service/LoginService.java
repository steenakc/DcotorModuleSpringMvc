package com.faith.springdemo.service;

import org.springframework.stereotype.Service;

import com.faith.springdemo.entity.Staff;

@Service
public interface LoginService {

	public Staff getStaff(String userName, String password);

}
