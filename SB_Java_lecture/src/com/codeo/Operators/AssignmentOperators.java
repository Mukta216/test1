package com.codeo.Operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int data=10;
		System.out.println(data);
		data=data+10;
		System.out.println(data);
		System.out.println("====================");
		System.out.println("  ");
		
		int value=9;
		value+=10;
		System.out.println("AssignmentOperators"+value);//19
		value-=4;
		System.out.println(value);//19-4=15
	}

}
