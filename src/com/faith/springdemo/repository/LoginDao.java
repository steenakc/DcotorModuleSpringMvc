package com.faith.springdemo.repository;

import org.springframework.stereotype.Service;

import com.faith.springdemo.entity.Staff;

@Service
public interface LoginDao {

	public Staff getStaff(String userName, String password);

}
