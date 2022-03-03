package com.training.pms.Banking_App2_Fisher;
import java.util.Scanner;
import java.io.IOException;
import java.sql.Statement;
import java.util.Scanner;

import com.training.pms.dao.BankingMethods;
import com.training.pms.dao.CustomerDAO;
import com.training.pms.dao.CustomerDAOImpl;

public class BankingMain<product> {
	
	private static final String con = null;
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	int choice2 = 0;
	int choice3 = 0;
	CustomerDAOImpl productDAO = new CustomerDAOImpl();
	BankingMethods product = new BankingMethods();

	public void startProductApp() throws IOException {

		// declaring local variables for input
		String employeeInfo = null;
		String customerInfo = null;
		String customerFirstName = null;
		String customerLastName = null;
		String customerAddress = null;
		String customerPhone = null;
		int customerPin = 0;
		double accountBalance = 0;
		double transferFunds = 0;
		double newAccountBalance = 0;
		double deposit = 0;
		double withdraw = 0;
		String employeeID = null;
		String employeeName = null;
		String employeeAddress = null;
		long employeePhone = 0;
		String customerID = null;
		
		
		
		

		while (true) {
			System.out.println("============================================================================================");
			System.out.println("Choose Customer or Employee");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("1.Employee");
			System.out.println("2.Customer");
			System.out.println("5.Exit");
			System.out.println("============================================================================================");

			System.out.println("Please Enter Choice :");
			System.out.println("============================================================================================");
			choice = scanner.nextInt();

			if (choice == 1) {

				switch (choice) {
				case 1:
					// user will choose either employee or customer
					System.out.println("====================================================================================");
					System.out.println("Welcome to the Employee Home");
					// take input from user/employee
					System.out.println(
							"-----------------------------------------------------------------------------------------------");
					System.out.println("Please Input Employee ID :");
					System.out.println("====================================================================================");
					employeeID = scanner.next();

					break;
				default:
					System.out.println("Invalid Choice Entry Please Try Again");
					break;
				}

				while(true) {
					System.out.println("=================================================================================");
					System.out.println("1. View Employee Information :");
					System.out.println("2. Input Customer ID to View Customer Information :");
					System.out.println("5. EXIT");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Please Enter Your Choice :");
					System.out.println("=================================================================================");
					choice2 = scanner.nextInt();

					switch (choice2) {
					case 1:
						System.out.println(
								"=======================================================================================");
						System.out.println("Employee Name :" + employeeName);
						System.out.println("Employee Address: " + employeeAddress);
						System.out.println("Employee Phone Number :" + employeePhone);
						System.out.println("Employee ID Number :" + employeeID);
						System.out.println(
								"=======================================================================================");

						break;

					case 2:
						System.out.println(
								"=======================================================================================");
						System.out.println("Customer First Name :" + customerFirstName);
						System.out.println("Customer Last Name :" +customerLastName);
						System.out.println("Customer Address :" + customerAddress);
						System.out.println("Customer Phone Number : " + customerPhone);
						System.out.println("Customer ID Number : " + customerID);
						System.out.println("Customer Account Balance" + accountBalance);

						break;

					default:
						System.out.println("Invalid Choice , Please enter (1-2) or 5 to EXIT");
						break;
					}
				
			}
	}


	
		while(true) {
		System.out.println("===================================================================================================");
	    System.out.println("BANKING    -     APP      M E N U");
	    System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("1. Add new user ");
		System.out.println("2. Check Account Balance ");
		System.out.println("3. Transfer Funds ");
		System.out.println("4. Deposit Funds ");
		System.out.println("5. Withdraw Funds ");
		System.out.println("9. E X I T ");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Please enter your choice : ");
		System.out.println("===================================================================================================");
		choice3 = scanner.nextInt();

		switch (choice3) {
		case 1:
			// add new customer information
			System.out.println("Welcome to the add new user section ");
			;
			// take input from user
			System.out.println("===============================================================================================");
			System.out.println("Please enter customer First name :");
			customerFirstName = scanner.next();
			
			System.out.println("Please enter customer Last Name :");
			customerLastName = scanner.next();

			System.out.println("Please enter customer phone number :");
			customerPhone = scanner.next();

			System.out.println("Please enter customer pin number :");
			customerPin = scanner.nextInt();
			System.out.println("===============================================================================================");
			System.out.println("Success your First Name :" + customerFirstName + " has been saved succcessfully ");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Success your Last Name :" +customerLastName+ " has been saved successfully ");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Success your phone number : " + customerPhone + " has been saved successfully ");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("success your pin number :" + customerPin + " has been saved successfully ");

			break;

		case 2:
			// check existing customer account balance
			System.out.println("====================================================================================");
			System.out.println("Welcome To Customer Account Balance");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Your Account Balance Is :" + accountBalance);
			System.out.println("===============================================================================================");
			accountBalance = newAccountBalance;
			accountBalance = scanner.nextInt();
			break;

		case 3:
			// transfer funds
			System.out.println("Welcome to The Transferring Funds Section ");
			System.out.println("===============================================================================================");
			System.out.println("Your Account Balance is : " + accountBalance);
			System.out.println("===============================================================================================");
			// take input from user to see how much to transfer
			System.out.println("Please enter amount to transfer :");
			transferFunds = scanner.nextInt();
			if(accountBalance < transferFunds) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Insuffecient Funds in Account");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Your Account Balance Is : " +accountBalance);
				accountBalance = scanner.nextInt();
			}else {
				System.out.println("Success Funds Have Been Transferred");
			
			System.out.println("===============================================================================================");
			System.out.println("Your new account balance is :" + newAccountBalance);
			System.out.println("===============================================================================================");
			newAccountBalance = accountBalance - transferFunds;
			newAccountBalance = scanner.nextInt();
			System.out.println("Congratulations, your account balance : " + accountBalance + " updated successfully");
			}
			break;

		case 4:
			// Deposit amount
			System.out.println("====================================================================================");
			System.out.println("Welcome to the Deposit Section");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Your Account Balance is : " + accountBalance);
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("How Much Would You Like to Deposit");
			System.out.println("-----------------------------------------------------------------------------------------------");
			deposit = scanner.nextInt();
			System.out.println("-----------------------------------------------------------------------------------------------");
			newAccountBalance = accountBalance = deposit;
			System.out.println("Your New Account Balance is: " + newAccountBalance);
			System.out.println("===============================================================================================");

			break;

		case 5:
			// withdraw funds
			System.out.println("====================================================================================");
			System.out.println("Welcome to the Widhdraw Section");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Your Account Balance is :" + accountBalance);
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("How Much Would You Like to Withdraw :");
			System.out.println("-----------------------------------------------------------------------------------");
			withdraw = scanner.nextInt();
			newAccountBalance = accountBalance - withdraw;
			System.out.println("Your New Account Balance is :" + newAccountBalance);
			System.out.println("===================================================================================");
			if(withdraw < accountBalance) {
				System.out.println("Insuffecient Funds in Account");
			}
			break;

		default:
			System.out.println("Invalid Choice , Please enter (1-5) or 9 to EXIT");
			break;
		}
		
		
		}
			}		
		}
	}

