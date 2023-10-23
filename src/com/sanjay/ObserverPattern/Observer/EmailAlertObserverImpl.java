package com.sanjay.ObserverPattern.Observer;

import com.sanjay.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	String emailId;
	//StockObservable stockObservable;
	public EmailAlertObserverImpl(String emailId) {
		this.emailId = emailId;
		//this.stockObservable = stockObservable;
	}

	@Override
	public void update() {
		sendMail(emailId,"aa gya product");
	}

	private void sendMail(String emailId2, String msg) {
		System.out.println("EmailUser:"+emailId2+" "+msg);
	}

}
