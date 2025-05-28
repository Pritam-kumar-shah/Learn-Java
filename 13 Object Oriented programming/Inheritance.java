import java.util.*;
public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        dogs dobby = new dogs();
        dobby.eat();
        // dobby.legs =4;
        // System.out.println(dobby.legs);
    }
    
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Mammals extends Animal{
    // int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class dogs extends Mammals{
    String breed;
}

// Derive class 
class Fish extends Animal{
    // int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

class birds extends Animal{
    // int legs;
    void fly(){
        System.out.println("Fly");
    }
}
