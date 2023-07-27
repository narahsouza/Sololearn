// Overriding & Overloading

// Double Trouble

public class Practice44 {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 10.2;
        
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
                
    }
    //complete the method for integer value type
    public static int doubleTheValue(int a) {
        int c = 2 * a;
        return c;
    }
    //overload the method for double value type
    public static double doubleTheValue(double b) {
        double c = 2 * b;
        return c;
    }
}