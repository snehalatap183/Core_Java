package com.scp.loop;

public class PatternTriangle {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			System.out.println("");

			for (int j = 0; j <= i; j++) {

				System.out.print("*" + "\t");

			}

		}

		System.out.println("");
	}

}