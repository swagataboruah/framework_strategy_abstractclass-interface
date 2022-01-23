// Day 4 - exception handling
// in catch block we try to handle the issue
// here if denominator is 0 then we can't perform division
// so in catch block we can give the user another chance to give another denominator value 
// we will use ArithmeticException in catch block
import java.util.Scanner;

public class ExceptionDemo2
{
	
	//lets take an example of div method
	public static int div(int a, int b) {
		int c=0;
		
		// exception 1 = null pointer exception
		// here since NPE occurs first, try block will deal with this first
		// when NPE occurs it will send command to catch block
		String s = null;
		System.out.println(s.length());
		
		
		
		// arithmetic exception where we can't divide by 0
		//c=a/b; // this line gives output
		// lets convert above line into try catch block
		try {
			
			c=a/b;
			
			// if we put return c; here will be valid? Yes cuz multiple return statements are valid
			return c; //returns the value of c and if this gets executed, command wont go till print hey
		} 
		
		// catch for NPE 
		catch (NullPointerException e) {
			System.out.println("npe caught");
		}
		
		// catch for arithmetic exception
		catch (ArithmeticException e) {
			System.out.println("enter b again");
			Scanner scanner = new Scanner(System.in);
			int d = scanner.nextInt();
			if(d==0) {
				System.out.println("enter b again!!");
				return 0;
			}
			else {
				c=a/d;
			}
			
			return c;
		}
		
		// we may get many more exceptions than what's given in the list 
		// we will give final exception Exception which is super class/ parent to all exceptions
		// WHAT HAPPENS IF WE PUT THIS BELOW PIECE OF CODE BEFORE THE PREVIOUS 2 EXCEPTION CATCH BLOCKS?
		// We will get error because since Exception is the parent class to ArithmeticException and NullPointerException it will anyway solve it and command wont even go to these 2 catch blocks
		catch (Exception e) {
			System.out.println("any exception can be handled with this");
		}
		
		finally {
			System.out.println("hey"); // this line can be considered as a finally block
			
		}
		// if we do consider as finally block then a closer work is done in one situation and not in other situation
		// THAT'S WHY WE NEED FINALLY BLOCK ---> Thats we should include hey statement inside finally so that it gets executed irrespective of whether the return c command in try block is giving output or not
		
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("enter number");
		int a = scanner.nextInt();
		System.out.println("enter b");
		int b = scanner.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a/b); //if b=0 then it gives unchecked exception or run time exception
		// so inorder to fix that exception we need to select this block and do right click -> surround -> try catch */
		
		try {
			System.out.println("enter number");
			int a = scanner.nextInt();
			System.out.println("enter b");
			int b = scanner.nextInt();
			int result = div(a,b);
		} 
		// when exception occurs --> it comes to catch and catch implements exception handling
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch");
			e.printStackTrace();
		}
		
		// System.out.println("this sentence get executed irespective of any occurance of exception");
		// if we do systemout.prinln here we will get output irrespective of whether we have an exception or not
		// so this acts like a finally block
		// if so then why do we need an actual finally block??
		
	}

}
