package com.namita.datatypes;

public class Classtask2 {
	public static void main(String[]args){
		//using nested loop
		for (int i=0;i<=5;i++)//for row looping
		{
         for (int j=0;j<=5;j++)//for column looping
         {
		if (i==0||i==5||j==0||j==5)
		{
		System.out.print("+");
         }
		else
         System.out.print(" ");
		}
         System.out.println();
       
	}
		
	}
}

