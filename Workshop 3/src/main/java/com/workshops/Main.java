package com.workshops;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// ArrayList usage
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9); // 10th item

		System.out.println(arr.get(3)); // Get item by index
		arr.remove(6); // Remove item by index
		arr.remove(6); // Remove item by index
		System.out.println("Size: " + arr.size());
		System.out.println(arr);
	}
}