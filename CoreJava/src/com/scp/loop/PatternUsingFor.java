package com.scp.loop;

public class PatternUsingFor 
{
	public static void main(String[] args)
	{

		for (int i = 1; i<=5; i++) 
		{

			System.out.println();

			for (int j = 1; j<=5; j++) 
			{
				if((i==j)||(i+j==6) )
					 

				    System.out.print("*"+"\t");
				
				else
						
					System.out.print("");
			}

				
	
		}
		
		System.out.println();
	}

}