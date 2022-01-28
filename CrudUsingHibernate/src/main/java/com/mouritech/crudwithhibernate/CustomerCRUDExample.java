package com.mouritech.crudwithhibernate;

import java.util.Scanner;

import com.mouritech.hibernateex.service.CustomerService;

public class CustomerCRUDExample {

	public static void main(String[] args) {
		char ch = 'y';
		String transaction = null;
		Scanner sc = new Scanner(System.in);
		CustomerService cusService = new CustomerService();
		while(ch == 'y') {
			System.out.println("Enter the transaction type");
			System.out.println("save : to insert a new customer");
			System.out.println("update : to update an customer");
			System.out.println("delete : to delete an customer");
			System.out.println("getall : to get all customer details");
			System.out.println("get : to get an customer detail");
			transaction = sc.next();
			switch (transaction) {
			case "save":
				cusService.customerSave();
				break;
			case "getall":
				cusService.getAllCustomers();
				break;
			case "delete":
				cusService.deleteCustomer();
				break;
			case "update":
				cusService.getDetailsToUpdate();
				break;
			case "get":
				cusService.getCustomerById();
				break;
			default:
				System.out.println("Not a valid transaction");
				break;
			}
			System.out.println("Do you want to continue (y-yes/n-no)");
			ch = sc.next().charAt(0);
		}

		sc.close();
	}

	}


