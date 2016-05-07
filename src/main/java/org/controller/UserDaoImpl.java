package org.controller;

import org.hibernate.Transaction;
import javax.transaction.Transactional;






import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAOClass.UserDAO;
import ModelClass.User;


@Repository

public class UserDaoImpl implements UserDAO {

	
	@Autowired
	 SessionFactory sessionFactory;
	
	public UserDaoImpl(){}
	
	@Transactional
	public void addRec(User user) {
		// TODO Auto-generated method stub
		try{
		System.out.println("###"+sessionFactory);
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(user);
	//	sessionFactory.close();
		tx.commit();
		session.close();
		//sessionFactory.getCurrentSession().save(user);
		System.out.println("*****"+user.getUsername());
	    System.out.println("*****"+user.getPassword());
		
		
		}
		catch(Exception e)
		{
			System.out.println("Errorrrrrrrr"+e.getMessage());
			sessionFactory.openSession();
		}
	}

}
