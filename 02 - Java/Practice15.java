// While Loops

// Math Class

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        //your code goes here
        int total = 1;
        while(fact <= number) {
            total *= fact;
            fact++;
        }
        System.out.print(total);
    }
}