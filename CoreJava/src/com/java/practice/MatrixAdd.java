package com.java.practice;

public class MatrixAdd {
	public static void main(String[] args) {
		
		
		int i,j;
		int c[][]=new int[3][3];
		int a[][]= {
				{1,3,6},
				{2,4,6},
				{7,8,9}
		};
		int b[][]= {
				{2,3,6},
				{2,7,5},
				{8,1,9}
		};
		//System.out.println("summation of matrix:");
		//System.out.println("subtraction of matrix:");
		System.out.println("multiplication of matrix:");
		
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				
				 //c[i][j]=a[i][j]+b[i][j];
				 //c[i][j]=a[i][j]-b[i][j];
				 c[i][j]=a[i][j]*b[i][j];
				
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
