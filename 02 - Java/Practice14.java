// The switch Statement

// Emotion Detector

import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emotion = scanner.nextInt();
        /*
        1 - "You are happy!"
        2 - "You are sad!"
        3 - "You are angry!"
        4 - "You are surprised!"
        other - "Unknown emotion."
        */
        
        // your code goes here

        switch(emotion) {
            case 1:
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3:
                System.out.println("You are angry!");
                break;
            case 4:
                System.out.println("You are surprised!");
                break;
            default:
                System.out.println("Unknown emotion.");
        }
    }
}