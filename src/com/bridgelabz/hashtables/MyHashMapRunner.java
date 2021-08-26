package com.bridgelabz.hashtables;

public class MyHashMapRunner {

	public static void main(String[] args) {
		String sentence = "to be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.getData(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.getData("to");
		System.out.println("The frequency is " + frequency);
		System.out.println(myHashMap.toString());

	}
}
