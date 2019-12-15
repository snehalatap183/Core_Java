package com.avp.hcl.codility;
import java.util.*;
public class TimePermutationFromDigit {
	public static void main(String[] args) { 

		  String[] str={"abc","abcd","ef","gh","efghi","jklm","pfj"}; 
		  Set<Character> hSet=new HashSet<Character>();  

		  for (int i=0; i<str.length-2;i++) 
		  {    
			  int count=0;
		      char[] ch=str[i].toCharArray(); 

		      for(int j=0; j<ch.length-2;j++){ 

		          if (ch[i]==ch[j] && i!=j){ 

		              count++; 
		              break; 
		          } 
		      } 

		      if (count==0){ 
		          for (char c:ch){ 
		          hSet.add(c); 	
		          } 
		      } 

		  } 

		    for (Character c:hSet){ 

		         System.out.print(c); 

		        } 
     
	}
}
