import java.util.*;
public class Polymorphism {
    public static void main(String[] args) {
        // calculator calc = new calculator();
        // System.out.println(calc.sum(2, 3));
        // System.out.println(calc.sum(2.3, 3.8));
        // System.out.println(calc.sum(2, 3 , 8));

        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats annything");
    }
}

class Deer  extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}


//  Method Overloading  OR  function overloading

class calculator{

    int sum(int a, int b){
        return a+b;
    }

    double sum(double a, double b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
