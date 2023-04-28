package com.greatlearning;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		System.out.println("hashSet: " + hashSet); // hashSet: []

		hashSet.add("Vishwa");
		hashSet.add("Mohan");
		System.out.println("hashSet: " + hashSet); // hashSet: [Mohan, Vishwa]

		hashSet.add("Shivani");
		hashSet.add("Mohan");
		System.out.println("hashSet: " + hashSet); // hashSet: [Shivani, Mohan, Vishwa]

		Iterator<String> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		/*
		 * Shivani Mohan Vishwa
		 */

	}

}