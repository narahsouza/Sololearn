// Nested if Statements

// Loyal Customers

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int purchases = read.nextInt();
       
        if(purchases > 15000){
            System.out.println("Gift card");
            //complete the code
            if(purchases > 30000){
                System.out.println("Gift card");
            }    
       }
    }    
}