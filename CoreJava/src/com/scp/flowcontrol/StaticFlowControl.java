package com.scp.flowcontrol;

public class StaticFlowControl {
	static int i = 10;
	static {
		m1();        //j is not initialized default value=0
		System.out.println("first static block");

	}

	public static void main(String[] args) {

		m1();       //j is initialized
		System.out.println("main method");
	}

	public static void m1() {

		System.out.println(+j);
	}
	static {
		System.out.println("second static block");}

	static int j = 20;

}