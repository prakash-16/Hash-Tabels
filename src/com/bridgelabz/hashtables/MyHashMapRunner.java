package com.bridgelabz.hashtables;

public class MyHashMapRunner {

	public static void main(String[] args) {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
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
		System.out.println(myHashMap.toString());
        myHashMap.removal("Avoidable".toLowerCase());
        System.out.println("List after removal of word 'Avoidable'.");
        System.out.println(myHashMap.toString());
	}
}
