package basicJava_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//exception = an event that occurs during the execution of a program that,
		//			  disrupts the normal flow of instructions			
		
		Scanner sn = new Scanner(System.in);

		try {
			System.out.print("Enter a whole number to divide: ");
			int x = sn.nextInt();
		
			System.out.print("Enter a whole number to divide by: ");
			int y = sn.nextInt();
		
			int z = x/y;
		
			System.out.println("result: "+z);
		}
		//catch the program before it's interrupt by exception 
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero!");
		}
		catch(InputMismatchException e) {
			System.out.println("You must enter whole number");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		//great to close scanner or file that have been open
		finally {
			sn.close();
		}
		
	}
}
