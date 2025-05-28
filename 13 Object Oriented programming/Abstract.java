import java.util.*;
public class Abstract {
    public static void main(String[] args) {
        
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
// Animal-->Horse-->Mustang

    }
}

abstract class Animal{
    String color;

    Animal(){
        color ="brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse contructor called");
    }

    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Mustang extends Horse{
   Mustang(){
    System.out.println("Mustang costructor called");
   }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow ";
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
