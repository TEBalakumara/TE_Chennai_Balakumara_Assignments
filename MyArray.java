package com.Te.Collections;

public class MyArray {
	
	private int[] arr;
	private int index = 0;
	private final int Default_Size = 5;

	public MyArray() {
		arr = new int[Default_Size];
	}

	public MyArray(int initSize) {
		arr = new int[initSize];
	}

	public boolean add(int element) {
		if (index < arr.length) {
			arr[index++] = element;
		} else {
			int[] arr2 = new int[arr.length + (arr.length / 2)];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
			arr[index++] = element;
		}
		return true;
	}

	public int size() {
		return arr.length;
	}
	
	public int get(int index) {
		return arr.length;
	}
}
