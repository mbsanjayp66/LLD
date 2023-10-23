package com.sanjay.lld;

import java.util.HashMap;

public class MyHashMap<K,V> {
	public static final int INITIAL_SIZE = 1<<4;
	public static final int MAXIMUM_CAPACITY = 1<<30;
	
	public Entry[] hashTable;
	
	public MyHashMap() {
		hashTable = new Entry[INITIAL_SIZE];
	}
	
	public MyHashMap(int capacity) {
		int hashSize = calHashMapSize(capacity);
		hashTable = new Entry[hashSize];
	}

	private int calHashMapSize(int capacity) {
		int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}
	
	public void put(K key,V value) {
		int hashCode = key.hashCode()%hashTable.length;
		Entry node = hashTable[hashCode];
		if(node==null) {
			Entry newNode = new Entry<K, V>(key, value);
			hashTable[hashCode] = newNode;  
		}else {
			Entry prevNode = node;
			while(node!=null) {
				if(node.key==key) {
					node.value = value;
					System.out.println("Inserted");
					return;
				}
				prevNode = node;
				node = node.next;
			}
			prevNode.next  = new Entry<K, V>(key, value);
			System.out.println("Inserted");
		}
	}
	
	public V get(K key) {
		int hashCode = key.hashCode()%hashTable.length;
		Entry node = hashTable[hashCode];
		if(node==null) {
			return null;
		}else {
			while(node!=null) {
				if(node.key.equals(key)) {
					return (V)node.value;
				}
			}
			return null;
		}
	}
	
	
	
	public static void main(String args[]) {
		 MyHashMap<Integer, String> map = new MyHashMap<>(7);
	        map.put(1, "hi");
	        map.put(2, "my");
	        map.put(3, "name");
	        map.put(4, "is");
	        map.put(5, "Shrayansh");
	        map.put(6, "how");
	        map.put(7, "are");
	        map.put(8, "you");
	        map.put(9, "friends");
	        map.put(10, "?");

	        String value = map.get(8);
	        System.out.println(value);

	}
}
