package com.scp.loop;

public class Pyramid {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			System.out.println("");
			
			for (int j = 0; j < 5; j++) {

				if ((i == 0 || i == 4) && j != 2) {

					// System.out.print(i+""+j+"\t");

					System.out.print(" " + "\t");
					continue;
				} else if ((i + j) % 2 == 0) {

					System.out.print("*" + "\t");
				} else
					System.out.print(" " + "\t");
			}
			System.out.println();
		}

	}

}
