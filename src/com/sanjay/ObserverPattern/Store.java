package com.sanjay.ObserverPattern;

import com.sanjay.ObserverPattern.Observable.IphoneObservableImpl;
import com.sanjay.ObserverPattern.Observable.StockObservable;
import com.sanjay.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.sanjay.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.sanjay.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		StockObservable iphoneObservable = new IphoneObservableImpl();
		NotificationAlertObserver ob1 = new EmailAlertObserverImpl("mbsanjay");
		NotificationAlertObserver ob2 = new MobileAlertObserverImpl("sanjkumar");
		iphoneObservable.add(ob2);
		iphoneObservable.add(ob1);
		iphoneObservable.setStockCount(10);
		
	}

}
