package com.greatlearning;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List: " + list); // List: [1, 2, 3, 4, 5]

		Iterator<Integer> itr = list.iterator();

		// hasNext() -> Returns true if the iteration has more elements.
		while (itr.hasNext()) {
			// next() -> Returns the next element in the iteration
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		// 1 2 3 4 5

		// forEach method
		for (Integer obj : list) {
			System.out.print(obj + " ");
		}
		// 1 2 3 4 5
	}

}
