// Code project

// Time Converter

import java.util.Scanner;

public class Practice09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here
		int seconds = days * 24 * 60 * 60;
		System.out.println(seconds);
		scanner.close();
		
	}
}

