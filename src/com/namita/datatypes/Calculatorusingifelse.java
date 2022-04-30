 package com.namita.datatypes;
import java.util.*;

public class Calculatorusingifelse {

	public static void main(String[] args) {// TODO Auto-generated method stub
		double num1,num2,ans;
		String op;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the numbers:");
		num1 =sc.nextDouble();
		num2 =sc.nextDouble();
		System.out.println("enter the operator like +,-,*,/:");
		op = sc.next();
		if(op.equals("+")|| op.equals("-")||op.equals("*")||op.equals("/"))
		{
		if (op.equals("+"))
		{
			ans =num1+num2;
			System.out.println("result is:"+ans);
		}
		else if  (op.equals("-"))
		{
			ans=num1-num2;
			System.out.println("result is:"+ans);
		}
		else if (op.equals("*"))
		{
			ans =num1*num2;
			System.out.println("result is:"+ans);
			
		}
		else if  (op.equals("/"))
		{
			ans =num1/num2;
			System.out.println("result is:"+ans);
		}
		}
		else {
			System.out.println("enter the valid operator:");
		}
		}
			
		}
	
		
	
    		
    		
    
	
		
		



