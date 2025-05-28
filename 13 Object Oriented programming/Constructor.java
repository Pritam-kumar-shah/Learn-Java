import java.util.*;
public class Constructor {
    static class Student{
        String name;
        int roll;
        String password;
        int marks[];
    
        //  Shallow Copy Constructor
        // Student (Student s1){
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.password = s1.password;
        //     marks = new int[3];
        //      this.marks=s1.marks; 
        // }
         

        // Deep Copy Constructor
        Student (Student s1){
            this.name = s1.name;
            this.roll = s1.roll;
            marks = new int[3];
            for(int i=0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
              }
        }
        // Constructor
        Student(){
           System.out.println("Constructor is called.....");
           marks = new int [3];
        }
    
        Student(String name){
            marks = new int[3];
            this.name = name;
        }
        
        Student(int roll){
            marks = new int[3];
             this.roll = roll;
        }
    }
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.name = "Pritam";
      s1.roll = 78;
      s1.password ="absc";
      s1.marks[0] = 100;
      s1.marks[1] = 90;
      s1.marks[2] = 80;
    //    Copy constructor
      Student s2 = new Student(s1);
      s2.password = "sah";
      for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
      }



    }
    
}

