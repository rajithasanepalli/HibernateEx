package com.mouritech.onetooneexample.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetooneexample.model.Stock_Details;
import com.mouritech.onetooneexample.util.HibernateUtil;

public class StockDetailsDao {
	public void saveStock(Stock_Details stockDetails) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(stockDetails);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Stock_Details getStockDetails(Long stockDetailsId) {
		Transaction transaction = null;
	Stock_Details stockDetailsById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			stockDetailsById = session.get(Stock_Details.class, stockDetailsId);
			if(stockDetailsById!=null) {
				
				System.out.println("Stock details are = " + stockDetailsById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stockDetailsById;
		

}}
