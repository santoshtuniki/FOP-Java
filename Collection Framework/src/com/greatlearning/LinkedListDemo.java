package com.greatlearning;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("list : " + list); // list : []

		// peek() -> Retrieves, but does not remove, the head (first element) of this
		// list
		System.out.println(list.peek()); // null

		list.add(1);
		list.add(2);
		System.out.println(list.peek()); // 1
		System.out.println("list : " + list); // list : [1, 2]

		list.add(0, 3);
		System.out.println("list : " + list); // list : [3, 1, 2]

		list.add(1, 7);
		list.addFirst(5);
		System.out.println("list : " + list); // list : [5, 3, 7, 1, 2]

		// offer() -> Adds the specified element as the tail (last element) of this
		// list.
		System.out.println(list.offer(9)); // true
		System.out.println("list : " + list); // list : [5, 3, 7, 1, 2, 9]

		// poll() -> Retrieves and removes the head (first element) of this list
		System.out.println("Polled element: " + list.poll()); // Polled element: 5
		System.out.println("list : " + list); // list : [3, 7, 1, 2, 9]
	}

}
