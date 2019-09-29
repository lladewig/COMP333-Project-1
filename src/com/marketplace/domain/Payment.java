package com.marketplace.domain;

public class Payment {
	
	private int paymentID;
	private Customer customer;
	private int cardNumber;
	private int securityCode;
	private String expirationDate;
	private String billingAddress;
	
	public Payment(Customer customer, int cardNumber, int securityCode, String expirationDate, String billingAddress) {
		this.customer = customer;
		this.cardNumber = cardNumber;
		this.securityCode = securityCode;
		this.expirationDate = expirationDate;
		this.billingAddress = billingAddress;
		
	}
	
	public Payment() {
		
	}
	
	public int getpaymentID() {
		return paymentID;
	}
	
	public void setpaymentID(int newpaymentID) {
		paymentID = newpaymentID;
	}
	
	public Customer getcustomer() {
		return customer;
	}
	
	public void setcustomer(Customer customer) {
		this.customer = customer;
	}
	
	public int getcardNumber() {
		return cardNumber;
	}
	
	public void setcardNumber(int newcardNumber) {
		cardNumber = newcardNumber;
	}
	
	public int getsecurityCode() {
		return securityCode;
	}
	
	public void setsecurityCode(int newsecurityCode) {
		securityCode = newsecurityCode;
	}
	
	public String getexpirationDate() {
		return expirationDate;
	}
	
	public void setexpirationDate(String newexpirationDate) {
		expirationDate = newexpirationDate;
	}	
}
