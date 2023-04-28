package com.greatlearning;

public class DynamicArrayDemo {
	int[] arr;
	int size, capacity;

	DynamicArrayDemo(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
	}

	void insert(int element) {
		if (size >= capacity) {
			growArray();
		}
		arr[size++] = element;
	}

	void growArray() {
		int[] tempArr = new int[2 * size];
		for (int i = 0; i < size; i++) {
			tempArr[i] = arr[i];
		}

		arr = tempArr;
		capacity = 2 * size;
	}

	int delete(int index) {
		if (index >= size) {
			return -1;
		}
		int deletedElement = arr[index];
		for (int i = index + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		size--;
		return deletedElement;
	}

	void display() {
		System.out.println("\nArray with size");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}

		System.out.println("\nArray with capacity");
		for (int i = 0; i < capacity; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String args[]) {

		DynamicArrayDemo obj = new DynamicArrayDemo(3);
		obj.insert(12);
		obj.insert(13);
		obj.insert(15);
		obj.insert(18);
		obj.display();

		System.out.println("\nDeleted Element: " + obj.delete(2));
		obj.display();

	}
}
