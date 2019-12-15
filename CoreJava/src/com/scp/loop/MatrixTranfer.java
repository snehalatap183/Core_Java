package com.scp.loop;

public class MatrixTranfer {
	
	public static void main(String[] args)
	{

		for (int i = 0; i < 5; i++) 
		{

			System.out.println("");

			for (int j = 0; j < 5; j++) 
			{

				if ((i == 2 || j == 2)) 
				{

					System.out.print(" " + "\t");
					continue;

				}

				else
					System.out.print(i + "" + j + "\t");

			}
	
		}
		
		System.out.println("");
	}

}
