package com.bridgelabz.hashtables;

public class MyLinkedList<K, V> {

	private INode head;
	private INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = tail;
	}

	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			INode tempNode = this.head;
			if (this.head.equals(this.tail)) {
				tempNode.setNext(node);
			} else {
				this.tail.setNext(node);
			}
			this.tail = node;
		}
	}

	public INode<K, V> search(K key) {
		INode<K, V> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public void remove(K key) {
		INode<K, V> tempNode = this.head;
		while(tempNode != null) {
			if(tempNode.getNext().getKey().equals(key)) {
				INode<K, V> tempVar = tempNode.getNext().getNext();
				tempNode.setNext(tempVar);
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void printMyNodes() {
		System.out.println("My Nodes : " + head);
	}
	
	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}

}
