package com.mphasis.training.pl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mphasis.training.entites.Account;
import com.mphasis.training.util.HibernateUtil;

public class CacheDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		Session session =sessionFactory.openSession();
		Account a1= (Account) session.get(Account.class, 1);
		session.close();
		 
		Session session1 =sessionFactory.openSession();
		Account a11= (Account) session1.get(Account.class, 1);
		session1.close();
		
		
	}

}
