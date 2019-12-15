package com.scp.loop;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {

			System.out.println("");

			for (int j = 0; j < 5; j++)

			{
				if (i == 4 && j == 2)

					break;

				System.out.print(i + "" + j + "\t");

			}

			System.out.println("");
		}

	}
}