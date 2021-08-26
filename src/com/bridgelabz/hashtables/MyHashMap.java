package com.bridgelabz.hashtables;

public class MyHashMap<K, V> {
	
	MyLinkedList<K, V> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}
	
	public V getData(K key) {
		MyHashMapNode myHashMapNode = (MyHashMapNode<K, V>) this.myLinkedList.search(key);
		if(myHashMapNode == null) {
			return null;
		}
		else {
			return (V) myHashMapNode.getValue();
		}
	}
	
	public void add(K key, V value) {
		MyHashMapNode myHashMapNode = (MyHashMapNode<K, V>) this.myLinkedList.search(key);
		if(myHashMapNode == null) {
			myHashMapNode = new MyHashMapNode(key, value);
			this.myLinkedList.add(myHashMapNode);
		}
		else {
			myHashMapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "MyHashMapNodes{" + myLinkedList + '}';
	}

	

}
