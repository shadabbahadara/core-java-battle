package com.khan.arrays;

public class ArrayTest {

	public static int getWinChance(int s1, int[] s) {
		int win = 0;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; i != j && j < s.length; j++) {
				if (s[i] + s[j] == s1) {
					win++;
				}
			}
		}

		return win;
	}

	public static void main(String[] args) {
		int[] s = { 1, 2, 4, 3, 5 };
		int chance = getWinChance(5, s);
		System.out.println(chance);
	}
}
