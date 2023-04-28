package com.greatlearning;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		// Arranges elements in natural order (Alphabetical)
		PriorityQueue<String> queue = new PriorityQueue<>();
		System.out.println("Priority Queue: " + queue); // Priority Queue: []

		queue.add("Vishwa");
		queue.add("Shivani");
		queue.add("Shilp Rao");
		queue.add("Salman");
		System.out.println("Priority Queue: " + queue); // Priority Queue: [Salman, Shilp Rao, Shivani, Vishwa]

		System.out.println("Head of the Queue: " + queue.element()); // Head of the Queue: Salman

		System.out.println("Head of the Queue: " + queue.peek()); // Head of the Queue: Salman

		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		// Salman Shilp Rao Shivani Vishwa

		System.out.println(queue.remove()); // Salman
		System.out.println(queue.remove("Vishwa")); // true
		System.out.println("Priority Queue: " + queue); // Priority Queue: [Shilp Rao, Shivani]

		System.out.println(queue.poll()); // Shilp Rao
		System.out.println("Priority Queue: " + queue); // Priority Queue: [Shivani]
	}

}