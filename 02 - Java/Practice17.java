// Do While Loops

// Safety First

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int password = 8819;
    int number;
    do {
        System.out.println("Write password");
        number = read.nextInt();
        } while(number != password);
	}
}