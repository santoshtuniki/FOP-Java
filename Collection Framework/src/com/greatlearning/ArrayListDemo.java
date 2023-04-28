package com.greatlearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList as reference & object
		ArrayList<Integer> list1 = new ArrayList<>();

		// List as reference & ArrayList as object
		List<Integer> list2 = new ArrayList<>();

		System.out.println("list 1: " + list1 + "\nlist 2: " + list2);
		/*
		 * list 1: [] list 2: []
		 */

		// add(e) -> add element at last
		list1.add(1);
		list1.add(2);
		System.out.println("list 1: " + list1); // list 1: [1, 2]

		// add(index, e) -> add element at index with e
		list1.add(0, 3);
		System.out.println("list 1: " + list1); // list 1: [3, 1, 2]

		list2.add(7);
		list2.add(8);
		System.out.println("list 2: " + list2); // list 2: [7, 8]

		// addAll(collection) -> add collection at last
		list2.addAll(list1);
		System.out.println("list 2: " + list2); // list 2: [7, 8, 3, 1, 2]

		// set(index, e) -> replace element at index with e
		list2.set(2, 101);
		System.out.println("list 2: " + list2); // list 2: [7, 8, 101, 1, 2]

		// remove(index) -> remove element at index
		int removed = list2.remove(0);
		System.out.println("removed element from list 2: " + removed); // removed element from list 2: 7
		System.out.println("list 2: " + list2); // list 2: [8, 101, 1, 2]

		// get(index) -> get the element at the index
		System.out.println("Element at 3rd index in list 2: " + list2.get(3)); // Element at 3rd index in list 2: 2

	}

}
