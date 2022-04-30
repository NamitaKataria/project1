package com.namita.datatypes;
import java.util.*;

public class Displayingcontent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factorial example 
		//3!=1*2*3=6
		//5!=1*2*3*4*5=120
		//declared variable here
		int n;
		int fact_var =1;
		//creating scanner objectS
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");//reading input from user
		n=sc.nextInt();
		//calculating factorial
		//for (int i=1;i<=n;i++) {
			//fact_var=fact_var*i;//fact_var=
			int i=1;//initialization
			while(i<=n)
			{
				fact_var=fact_var*i;
				i++;//step value
				
		}
		//displaying factorial resultS
		System.out.println("factorial of the number: "+n+" is:"+fact_var);

	}

}
