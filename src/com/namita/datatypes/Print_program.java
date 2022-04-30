package com.namita.datatypes;

class N{ 
	static int c=10;
}


public class Print_program {
int a=10;
String b;
static int c=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c=30;
		
		System.out.println("10"+"20");//1020
		System.out.println("n"+"a");//na
		System.out.println("n"+10);//n10
		System.out.println(10+"a");//10a
		System.out.println(5+10);//15
		System.out.println("p"+16+"_"+"@"+"512"+512);//p16_@512512
		System.out.println(c);
		System.out.println(" \n "+N.c);
		
		
		
		Print_program  pp= new Print_program();//object creation
			//	System.out.println(pp.a);
		//System.out.println(a);//cannot make a static ref to non static field
		pp.b="namita";
		
		System.out.println(pp.b);
		

	}

}
