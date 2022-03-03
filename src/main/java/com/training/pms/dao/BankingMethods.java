package com.training.pms.dao;

public class BankingMethods {
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerFirstName == null) ? 0 : customerFirstName.hashCode());
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((customerInfo == null) ? 0 : customerInfo.hashCode());
		result = prime * result + ((customerLastName == null) ? 0 : customerLastName.hashCode());
		result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
		result = prime * result + customerPin;
		temp = Double.doubleToLongBits(deposit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result + ((employeeID == null) ? 0 : employeeID.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + (int) (employeePhone ^ (employeePhone >>> 32));
		temp = Double.doubleToLongBits(newAccountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(transferFunds);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(withdraw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankingMethods other = (BankingMethods) obj;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerFirstName == null) {
			if (other.customerFirstName != null)
				return false;
		} else if (!customerFirstName.equals(other.customerFirstName))
			return false;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		if (customerInfo == null) {
			if (other.customerInfo != null)
				return false;
		} else if (!customerInfo.equals(other.customerInfo))
			return false;
		if (customerLastName == null) {
			if (other.customerLastName != null)
				return false;
		} else if (!customerLastName.equals(other.customerLastName))
			return false;
		if (customerPhone == null) {
			if (other.customerPhone != null)
				return false;
		} else if (!customerPhone.equals(other.customerPhone))
			return false;
		if (customerPin != other.customerPin)
			return false;
		if (Double.doubleToLongBits(deposit) != Double.doubleToLongBits(other.deposit))
			return false;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeID == null) {
			if (other.employeeID != null)
				return false;
		} else if (!employeeID.equals(other.employeeID))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeePhone != other.employeePhone)
			return false;
		if (Double.doubleToLongBits(newAccountBalance) != Double.doubleToLongBits(other.newAccountBalance))
			return false;
		if (Double.doubleToLongBits(transferFunds) != Double.doubleToLongBits(other.transferFunds))
			return false;
		if (Double.doubleToLongBits(withdraw) != Double.doubleToLongBits(other.withdraw))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "BankingMethods [customerInfo=" + customerInfo + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerAddress=" + customerAddress + ", customerPhone="
				+ customerPhone + ", customerPin=" + customerPin + ", accountBalance=" + accountBalance
				+ ", transferFunds=" + transferFunds + ", newAccountBalance=" + newAccountBalance + ", deposit="
				+ deposit + ", withdraw=" + withdraw + ", employeeID=" + employeeID + ", employeeName=" + employeeName
				+ ", employeeAddress=" + employeeAddress + ", employeePhone=" + employeePhone + ", customerID="
				+ customerID + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public String getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public int getCustomerPin() {
		return customerPin;
	}
	public void setCustomerPin(int customerPin) {
		this.customerPin = customerPin;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getTransferFunds() {
		return transferFunds;
	}
	public void setTransferFunds(double transferFunds) {
		this.transferFunds = transferFunds;
	}
	public double getNewAccountBalance() {
		return newAccountBalance;
	}
	public void setNewAccountBalance(double newAccountBalance) {
		this.newAccountBalance = newAccountBalance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

}
