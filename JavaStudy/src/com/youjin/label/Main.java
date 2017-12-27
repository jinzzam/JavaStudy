package com.youjin.label;

public class Main {
	public static void main(String[] args) {
		gugudan :for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 4 && i == 4) {
					break gugudan;
				}
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}
	}
}
