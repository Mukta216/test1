package com.codeo.arrays;

public class SingleDArray {

	public static void main(String[] args) {
//		 this approach only for array value fixed and not 
//		changed in future also
		//int a[]=new int[5];
		int a[]= {100,200,300,400,500};
		System.out.println("length of an array is "+a.length);
		//for loop     cond i<=4 i<5 
		for(int i=0;i<a.length;i++) {
			//System.out.println("hello");
				System.out.println(a[i]);
		}
		//enhanced for loop //foreach loop
		for(int x:a) {
			System.out.println(x);
		}
				
	}

}
