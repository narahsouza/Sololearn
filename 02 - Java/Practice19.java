// Code project

// Loan Calculator

import java.util.Scanner;

public class Practice19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
        int payment;
		//your code goes here
		for(int x = 1; x <=3; x++) {
            payment = amount * 10 / 100;
            amount = amount - payment; 
        }
        System.out.println(amount);
	}
}