package com.mouritech.hibernateex;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernateex.entity.Student;
import com.mouritech.hibernateex.util.HibernateUtil;

public class HibernateExMain {

	public static void main(String[] args) {

		Student student = new Student(123L, "Rama", "Krishna", "53543534");
		Student student1 = new Student(124L, "Rama1", "Krishna1", "535435345");

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();
			// save the student objects in to database
			session.save(student);
			session.save(student1);
			// commit transaction
			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}

		// retrieve the data from database to java program using hibernate

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			List<Student> studentList = session.createQuery("from Student", Student.class).list();
			studentList.forEach(stud -> System.out.println(stud));

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}


	}

}
