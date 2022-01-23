import java.util.Scanner;

public class ExceptionDemo1
{
	
	//lets take an example of div method
	public static int div(int a, int b) {
		int c=0;
		//c=a/b; // this line gives output
		
		// lets convert above line into try catch block
		try {
			c=a/b;
			
			// if we put return c; here will be valid? Yes cuz multiple return statements are valid
			return c; //returns the value of c and if this gets executed, command wont go till print hey
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hey"); // this line can be considered as a finally block
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
