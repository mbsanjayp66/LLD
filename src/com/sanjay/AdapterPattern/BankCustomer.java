package com.sanjay.AdapterPattern;

public class BankCustomer extends BankDetails implements CreditCard {
	
	@Override
	public void giveBankDetails() {
		setAccHolderName("Sanjay");
		setAccNumber(1234);
		setBankName("SBI");
	}

	@Override
	public String getCreditCard() {
		return getAccHolderName()+getAccNumber()+getBankName();
	}

}
