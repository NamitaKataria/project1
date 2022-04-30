package com.namita.datatypes;
import java.util.*;

public class Calculatoreg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// running infinite loop
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1=sc.nextInt();
		System.out.println("enter the second number:");
		int num2=sc.nextInt();
		//System.out.println("please select the operation:\n 1.addition\n 2.subtraction\n 3.multiplication\n 4.division\n 5.exit");
		System.out.println("please select the op\n"+"1.add\n"+"2.sub\n"+"3.mul\n"+"4.div\n"+"5.exit");		
		
		int op=sc.nextInt();
		
		if (op==1) {
			int add=num1+num2;
			System.out.println("addition result is:"+add);
			
		}
		 if (op==2) {
			int sub=num1-num2;
			System.out.println("subtraction result is:"+sub);
		}
		 if (op==3) {
			int mul=num1*num2;
			System.out.println("multiplication result is:"+mul);
		}
		 if (op==4) {
			int div=num1/num2;
			System.out.println("division result is:"+div);
		}
		 else if  (op==5) {
			System.out.println("exit");
			break;
		}
		
		 else  
			System.out.println("enter the valid operator:");
		System.out.println();
		}
	}
	}


