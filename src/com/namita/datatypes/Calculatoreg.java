package com.namita.datatypes;

import java.util.*;

public class Calculatoreg  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		double ans;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no:");
		num1=sc.nextDouble();
		System.out.println("enter the second no:");
		num2 =sc.nextDouble();
		System.out.println("enter the operator(+,-,*,/ :)");
		op =sc.next().charAt(0);
		switch(op) {//using switch break
		case'+':ans=num1+num2;
		break;
		case'-':ans=num1-num2;
		break;
		case'*':ans=num1*num2;
		break;
		case'/':ans=num1/num2;
		break;
		case'%':ans=num1%num2;
		break;
		default:System.out.println("error!enter the correct operator");
		return;
		}
		
		System.out.println("the result is given as :");
		System.out.println(num1+" "+op+" "+num2+"="+ans);
		

	}

}
