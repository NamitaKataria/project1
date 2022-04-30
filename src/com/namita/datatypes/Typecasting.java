package com.namita.datatypes;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("implicit type casting");
		char a ='A';
		System.out.println("the value of a:"+a);
		int b= a;
		System.out.println("the value of b:"+b);
		float c=a;
		System.out.println("the value of c:"+c);
		long d=a;
		System.out.println("the value of d:"+d);
		double e=a;
		System.out.println("the value of e:"+e);
		System.out.println("\n");
		System.out.println("explicit type casting");
		double x=45.5;
		int y=(int)x;
		System.out.println("value of x:"+x);
		System.out.println("value of y:"+y);
	}

}
