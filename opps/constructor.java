package opps;

class Vehicle{
    int wheels;
    Vehicle(int No_of_wheels){
        this.wheels = No_of_wheels;
    }
    
}

public class constructor {
    constructor(){
        // Its NO_ARG constructor 
        System.out.println("Constructor Called");   
    }

    public static void main(String[] args) {
        constructor obj = new constructor();
        Vehicle car = new Vehicle(45);

        System.out.println(car.wheels + " wheels");

    }
}
