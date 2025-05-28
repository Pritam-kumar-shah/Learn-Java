public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Progreesive";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        
    }
}

class Student{
    static  int returnper(int m, int p, int c){
        return (m+c+p)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
