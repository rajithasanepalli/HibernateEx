package com.mouritech.employeehibernateex;

import com.mouritech.employeehibernateex.entity.Employee;
import com.mouritech.employeehibernateex.util.EmployeeUtil ;


import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;

public class EmployeeMainHibernate {

	public static void main(String[] args) {

		Employee emp = new Employee (123L, "Rama", "Krishna", "53543534");
		Employee  emp1 = new Employee (124L, "Rama1", "Krishna1", "535435345");

		Transaction transaction = null;

		try (Session session =  EmployeeUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();
			// save the student objects in to database
			session.save(emp);
			session.save(emp1);
			// commit transaction
			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}

		// retrieve the data from database to java program using hibernate

		try (Session session =  EmployeeUtil.getSessionFactory().openSession()) {

			List<Employee> empList = session.createQuery("from Employee", Employee.class).list();
			empList.forEach(emply -> System.out.println(emply));

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}

}
