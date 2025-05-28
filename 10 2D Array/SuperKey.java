import java.util.*;
public class SuperKey {
    public static void main(String[] args) {
        Horse s1 = new Horse();
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}
