package com.hutech.javaprograms;

public class CountPairs {

	public static void main(String[] args) {
		int[] i1 = { 8, 3, 1, 6, 4, 9, 7, 5, 11, 13 };
		int count = 0;
		for (int i = 0; i + 1 < i1.length; i++) {
			int diff = i1[i] - i1[i + 1];
			if (diff == 2 || diff == -2) {
				int pair = count += 1;
				System.out.print("Pair " + pair + "---> ");
			}
			System.out.println(i1[i] + "-" + i1[i + 1] + " = " + diff);
		}
		System.out.println("Total no of pair = " + count);
	}
}