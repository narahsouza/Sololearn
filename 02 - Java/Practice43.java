// Polymorphism

// Car Classes

class Practice43 {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();
        
        //calls
        vehicle.start();
        vehicle.resource();
        electric.start();
        electric.resource();
        hybrid.start();
        hybrid.resource();
    }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElectricVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use electricity"*/
    public void resource(){
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use both petrol and electricity"*/
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }
}