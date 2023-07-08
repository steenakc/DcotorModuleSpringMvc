package com.faith.springdemo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faith.springdemo.entity.Staff;

@Repository
public class LoginDaoImplementation implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Staff getStaff(String userName, String password) {
		Session currentSession = sessionFactory.getCurrentSession();
		try {

			System.out.println("\n\n connecting database");
			System.out.println(userName);
			System.out.println(password);
			Query<Staff> staffNameQuery = currentSession
					.createQuery("from Staff where emailId=:emailId_ and passWord=:passWord_ ", Staff.class);
			staffNameQuery.setParameter("emailId_", userName);
			staffNameQuery.setParameter("passWord_", password);
			Staff staff = staffNameQuery.getResultList().get(0);
			return staff;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("\n\n\n\n");

		}
		return null;
	}

}
