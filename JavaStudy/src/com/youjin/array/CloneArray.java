package com.youjin.array;

public class CloneArray {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2;
		for (int i = 0; i < 5; i++) {
			arr1[i] = i * i;
		}
		arr2 = arr1.clone();
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}
	}

}
