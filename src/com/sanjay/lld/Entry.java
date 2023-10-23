package com.sanjay.lld;

public class Entry<K,V> {
	public K key;
	public V value;
	public Entry next;
	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	
}
