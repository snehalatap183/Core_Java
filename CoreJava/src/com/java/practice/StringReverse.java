package com.java.practice;



public class StringReverse {

	public static void main(String[] args) {
		/*String s1="xyz";
		char[] ch=s1.toCharArray();
		System.out.println(ch);
		
		for(int i=ch.length-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			
		}*/
		
		
		
		
		/*String s1="i am swaraj";
		String rev="";
		String[] s=s1.split("\\s");
		
	

		for(int i=s.length-1;i>=0;i--) {
			
			rev+=s[i];
			if(i!=0) {
				rev+="\t";
			}
			
		}
		System.out.println(s1);	//i am swaraj
		System.out.println(rev);//swaraj	am	i
									
		
		*/
		
		String s1="i am swaraj";
		String rev="";
		String[] words=s1.split("\\s");
		String word="";
		
			
		for(int j=0;j<words.length;j++)
		{
		     word=words[j];
	    	
			char[] ch=word.toCharArray();
		
			for(int i=ch.length-1;i>=0;i--) {
			
			rev+=ch[i];
		
		}
		
		}							
		
		System.out.print(rev);
		
		/*String s1="i am swaraj";
		String rev="";
		String[] s=s1.split("");
		
	

		for(int i=s.length-1;i>=0;i--) {
			rev+=s[i];
			if(i!=0) {
				rev+="";
			}
			
		}
		System.out.println(s1);	//i am swaraj
		System.out.println(rev);//jaraws ma i
									*/
		
		

			
		
	
	/*
	int n=9876;
	int rev=0;
	while(n!=0) {
		rev=rev*10;
		rev=rev+n%10;
		n=n/10;
	}
	System.out.println(rev);
	*/
		
		
		 
		
		


	/*String s="12abc34ef3ghij567";
	int sum=0;
	String str="";
	for(int i=0;i<s.length();i++) {
		
		if(Character.isDigit(s.charAt(i))==true) {
				str=str+s.charAt(i);	
		}else {
			int n=Integer.parseInt(String.valueOf());
			sum+=n;
			str="";
		}
			 
		
	}
		System.out.println(sum);
	*/ 
	
}	
}
