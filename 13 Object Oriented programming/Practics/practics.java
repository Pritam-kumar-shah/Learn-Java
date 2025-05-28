import java.util.*;
class complex{
    int real ;
    int img;
    
    public complex(int r, int i){
        real = r;
        img = i;

    }

    public static complex add(complex a, complex b){
        return new complex((a.real+b.real), (a.img+b.img));
    }

    
    public static complex diff(complex a, complex b){
        return new complex((a.real-b.real), (a.img-b.img));
    }

    
    public static complex product(complex a, complex b){
        return new complex(((a.real*b.real)-(a.img*b.img)), ((a.real*b.real)+(a.img*b.img)));
    }

    public void printcomplex(){
        if (real==0&& img!=0) {
            System.out.println(img+"i");
        }
        else if (img==0 && real!=0) {
            System.out.println(real);
        }
        else {
            System.out.println(real + " + " + img + "i");
        }
    }
}
public class practics {
    public static void main(String[] args) {
        
    
    complex c = new complex(4, 5);
    complex d = new complex(9, 4);


    complex e =  complex.add(c, d);
    complex f =  complex.diff(c, d);
    complex g =  complex.product(c, d);

    e.printcomplex();
    f.printcomplex();
    g.printcomplex();

    }
    
    
}
