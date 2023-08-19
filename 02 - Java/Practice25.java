// Code project

// Reverse a String

public class Practice25 {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
        int x = arr.length-1;
        for (int y = x; y >=0; y--) {
            char z = arr[y];
            System.out.print(z);
        }
	}
}