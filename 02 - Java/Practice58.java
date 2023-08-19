// Threads

// Welcome!

class Practice58 {
    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority
        name.setPriority(2);
        
        Welcome welcome = new Welcome();
        //set priority
        welcome.setPriority(1);
        
        welcome.start();
        name.start();
    }
}

//extend the Thread class
class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}