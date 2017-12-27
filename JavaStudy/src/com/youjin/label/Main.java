package com.youjin.label;

public class Main {
	public static void main(String[] args) {
		boolean sw = true;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 4 && i == 4) {
					sw = false;
					break;
				}
				System.out.println(i + "X" + j + "=" + i * j);
			}
			if (sw == false)
				break;
		}
	}
}
