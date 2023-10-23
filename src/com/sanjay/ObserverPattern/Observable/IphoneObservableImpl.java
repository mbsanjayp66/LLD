package com.sanjay.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import com.sanjay.ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {
	
	public List<NotificationAlertObserver>observerList = new ArrayList<>();
	public int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver observer:observerList) {
			observer.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount==0) {
			notifySubscriber();
		}
		stockCount+=newStockAdded;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
