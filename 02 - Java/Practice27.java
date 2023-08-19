// Methods

// Friendly Robot

public class Practice27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberOfPeople = read.nextInt();
        
        for (int i = 0; i < numberOfPeople; i++) {
            welcome();
        }
    }
    public static void welcome() {
        //complete the method
        System.out.println("Welcome!");
    }
}