package com.youjin.array;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		for (int i = 0; i < 5; i++) {
			arr1[i] = i * i;
		}
		System.arraycopy(arr1, 0, arr2, 0, 5);	//src, srcPos, dest, destPos, length
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}
	}
}
