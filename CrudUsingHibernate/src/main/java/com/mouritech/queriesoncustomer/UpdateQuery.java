package com.mouritech.queriesoncustomer;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mouritech.hibernateex.entity.Customer;


public class UpdateQuery {
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Customer> updateQuery = session.createQuery
				("update Customer set customername =:customerName where customerid = :id");//here persistent class is Product

		updateQuery.setParameter("customerName", new String("Keerthi"));
		updateQuery.setParameter("id", 6);

		int updateStatus = updateQuery.executeUpdate();
		System.out.println(updateStatus);
		
		tx.commit();
		
		
		sFactory.close();
		session.close();
		

	}

}
