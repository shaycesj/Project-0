package com.training.pms.dao;

public interface CustomerDAO {
	
	public void accountBalance(BankingMethods product);
	
	public void customerFirstName(BankingMethods product);
	
	public void customerLastName(BankingMethods product); 
	
	public void customerAddress(int customerAddress);
	
	public void customerPhone(BankingMethods customerPhone); 
	
	public void customerPin(int customerPin); 
	
	public void accountBalance(int accountBalance); 
	
	public void transferFunds(int transferFunds); 
	
	public void customerInfo(BankingMethods product); 
	
	public void deposit(int deposit); 
	
	public void withdraw(int withdraw); 
	
	public void employeeID(BankingMethods employeeID); 
	
	public void employeeName(BankingMethods employeeName); 
	
	public void employeeAddress(BankingMethods employeeAddress); 
	
	public void employeePhone(int employeePhone); 
	
	public void customerID(BankingMethods customerID); 
	
	

}
