package com.mouritech.queriesoncustomer;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import com.mouritech.hibernateex.entity.Customer;

public class SelectQuery {
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		
		@SuppressWarnings("unchecked")
		Query<Customer> selectQuery = session.createQuery("from Customer");//here persistent class is Product
		selectQuery.setFirstResult(1);
		selectQuery.setMaxResults(4);
		List<Customer> listOfCustomers = selectQuery.list();
		

		Iterator<Customer> itr = listOfCustomers.iterator();
		
		while(itr.hasNext()) {
			Customer p = itr.next();
			System.out.println("customer Id = " + p.getCusId());
			System.out.println("customer name = " + p.getCusName());
			System.out.println("customer email = " + p.getCusEmail());
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}
		
		
		
		
		
		sFactory.close();
		session.close();
		
}}
