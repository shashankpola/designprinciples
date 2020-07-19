package com.epam.DESIGN_PRINCIPLES.DesignPrinciples;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
			Scanner scnr=new Scanner(System.in);
			char ch;
			
			System.out.println("Enter choice");
			do
			{
				System.out.println("1.add");
				System.out.println("2.subtract");
				System.out.println("3.multiply");
				System.out.println("4.divide");
				System.out.println("enter option");
				int n=scnr.nextInt();
				System.out.println("Enter first number");
				int n1=scnr.nextInt();
				System.out.println("Enter second number");
				int n2=scnr.nextInt();
				switch(n)
				{
					case 1:System.out.println("Addition is " + c.add(n1,n2));
					break;
					case 2:System.out.println("subtraction is " + c.subtract(n1,n2));
					break;
					case 3:System.out.println("multiplication is " + c.multiply(n1,n2));
					break;
					case 4:System.out.println("division is " + c.divide(n1,n2));
					break;
				}
				System.out.println("do you want to perform another:(Y|N)");
				ch=scnr.next().charAt(0);
			}while(ch=='y' || ch=='Y');
			
			scnr.close();
				}

}
