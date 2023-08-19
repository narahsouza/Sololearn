// Multiple Exceptions

// No Zeroes

import java.util.Scanner;
import java.util.InputMismatchException;

public class Practice57 {
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
	        //your code goes here
			System.out.println(num1/num2);
	    } catch(ArithmeticException e) {
	        System.out.println("Mistake: division by zero");
	    } catch(InputMismatchException e) {
	        System.out.println("Mistake: wrong value type");
	    }
	}
}