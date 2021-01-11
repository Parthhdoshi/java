package opps;

class cat{
    public void walk(){
        System.out.println("Cat is walking");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }
}

class dog{
    public void bark(){
        System.out.println("Dog is barking");
    }
}

public class MainClass {
    public static void main(String[] args) {
        cat c1 = new cat();
        dog d1 = new dog();
        c1.walk();
        c1.eat();
        d1.bark();
        
    }
}
