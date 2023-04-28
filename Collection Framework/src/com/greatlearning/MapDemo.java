package com.greatlearning;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// Creating an empty HashMap
		Map<String, Integer> mymap = new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		mymap.put("a", new Integer(100));
		mymap.put("b", new Integer(200));
		mymap.put("c", new Integer(300));
		mymap.put("d", new Integer(400));

		System.out.println("Map: " + mymap); // {a=100, b=200, c=300, d=400}

		System.out.println(mymap.entrySet()); // [a=100, b=200, c=300, d=400]

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> mp : mymap.entrySet()) {
			// Printing keys
			System.out.print(mp.getKey() + ":");
			System.out.println(mp.getValue());
		}
		/*
		 * a:100 b:200 c:300 d:400
		 */
	}

}
