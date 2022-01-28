package com.mouritech.customerqueryex;

import java.util.Iterator;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.mouritech.hibernateex.entity.Customer;

public class CriteriaQueryEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// employeeSave();
		betweenCriteria();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();

		Criteria crit = session.createCriteria(Customer.class);
		Criterion cn = Restrictions.ge("customerid", new Float(1));

		// select * from product where productprice > 25000
		crit.add(cn);
		List customerList = crit.list();
		System.out.println("List of total size......" + customerList.size());
		@SuppressWarnings("unchecked")
		Iterator<Customer> itr = customerList.iterator();

		while (itr.hasNext()) {
			Customer c = itr.next();
			System.out.println("Customer Id = " + c.getCusId());
			System.out.println("Customer Id = " + c.getCusName());
			System.out.println("Customer Id = " + c.getCusAge());
			System.out.println("Customer Id = " + c.getCusEmail());
			System.out.println("Customer Id = " + c.getCusMobileNo());
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}

		sFactory.close();
		session.close();

	}

	public static void customerSave() {
		Transaction transaction = null;
		Customer c1 = new Customer(1L, 29L, "samhi", "samhi@gmail.com", "7995960555");
		Customer c2 = new Customer(2L, 59L, "savitri", "savii@gmail.com", "8995960555");
		Customer c3 = new Customer(3L, 20L, "gani", "gani@gmail.com", "8975960555");
		Customer c4 = new Customer(4L, 34L, "soni", "soni@gmail.com", "9995960555");
		Customer c5 = new Customer(5L, 22L, "roji", "roji@gmail.com", "7976960655");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();

		// start the transaction
		transaction = session.beginTransaction();
		// save the employee object in to database
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		// commit transaction
		transaction.commit();

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void betweenCriteria() {
		// employeeSave();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Criteria crit = session.createCriteria(Customer.class);
		Criterion cn = Restrictions.not(Restrictions.between("customerage", new Long(12), new Long(55)));
		// select * from product where productprice between 25 and 45
		crit.add(cn);
		List customerList = crit.list();
		System.out.println("List of total size......" + customerList.size());
		@SuppressWarnings("unchecked")
		Iterator<Customer> itr = customerList.iterator();

		while (itr.hasNext()) {
		Customer c = itr.next();
		System.out.println("Customer Id = " + c.getCusId());
		System.out.println("Customer Id = " + c.getCusName());
		System.out.println("Customer Id = " + c.getCusAge());
		System.out.println("Customer Id = " + c.getCusEmail());
		System.out.println("Customer Id = " + c.getCusMobileNo());
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}

		sFactory.close();
		session.close();

	}

}
