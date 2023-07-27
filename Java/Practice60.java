// ArrayList

// Playing Keep Away With 3

import java.util.ArrayList;
import java.util.Scanner;

public class Practice60 {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        
        int soma = 0;
        
        while(evennums.size()<3){
            int num = scanner.nextInt();
            //your code goes here

            evennums.add(num);
            soma += num;
            
        }
        
        //calculate and output the average integer value
        
        System.out.println(soma/3);
    }
}