// Summing Elements in Arrays

// Summing Multipliers

import java.util.Scanner;

public class Practice21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        //your code goes here
        int modulo;
        int soma = 0;
        for (int x = 0; x < length; x++) {
            modulo = array[x] % 4;
            if (modulo == 0) {
                soma += array[x];
            }
        }
        System.out.println(soma);
    }
}