// Code project

// Shapes

import java.util.Scanner;

abstract class Shape {
    double width;
    int num;
    abstract void area();
    
    public Shape (int num) {
        this.num = num;
        this.width = width;
    }
}
//your code goes here
public class Square extends Shape {

    public Square (int num) {
        super(num);
    }
    
    public void area() {
        width = num * num;
        int widthSquare = (int) width;
        System.out.println(widthSquare);
    }
}

public class Circle extends Shape {

    public Circle (int num) {
        super(num);
    }
    
    public void area() {
        width = Math.PI * num * num;
        System.out.println(width);
    }
}

public class Practice55 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}