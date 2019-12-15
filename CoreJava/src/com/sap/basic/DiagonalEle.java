package com.sap.basic;

public class DiagonalEle {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			System.out.println("");

			for (int j = 0; j < 5; j++) {
				if (i == j)

					System.out.print(i + "" + j + "\t");
			}

		}

		System.out.println("");
	}

}
