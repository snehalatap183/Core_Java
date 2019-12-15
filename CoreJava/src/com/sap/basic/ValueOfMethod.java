package com.sap.basic;

public class ValueOfMethod {
	
	public static void main(String[] args) {
		
		long l = 1000;
		double d = l;
		byte b = (byte)l;
		char ch = (char)l;
		
		float f = 102.3f;

		//Byte bw = (byte)b;
				
		
		Byte bw = Integer.valueOf((int)l).byteValue();
		Short sw= Integer.valueOf(b).shortValue();
		Integer iw = Integer.valueOf(b);
		Long lw = Integer.valueOf(b).longValue();
		Float fw = Integer.valueOf(b).floatValue();
		Double dw = Integer.valueOf(b).doubleValue();
	
		System.out.println(dw);
		
		
	}

}
