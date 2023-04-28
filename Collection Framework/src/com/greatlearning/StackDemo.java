package com.greatlearning;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		System.out.println("Is Stack Empty? " + stack.isEmpty()); // Is Stack Empty? true

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Stack : " + stack); // Stack : [1, 2, 3, 4]

		System.out.println(stack.peek()); // 4

		System.out.println(stack.pop()); // 4
		System.out.println("Stack : " + stack); // Stack : [1, 2, 3]

		// search(e) -> Returns -1 if element not present, Returns index of element if
		// present with index beginning from 1.
		System.out.println(stack.search(4)); // -1
		System.out.println(stack.search(2)); // 2

	}

}