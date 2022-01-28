package com.mouritech.queriesoncustomer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mouritech.hibernateex.entity.Customer;

public class DeleteQuery {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Customer> deleteQuery = session.createQuery
				("delete from Customer where customerid = :id");//here persistent class is Product

		
		deleteQuery.setParameter("id", 5);

		int deleteStatus = deleteQuery.executeUpdate();
		System.out.println(deleteStatus);
		
		tx.commit();
		
		
		sFactory.close();
		session.close();

	}

}
