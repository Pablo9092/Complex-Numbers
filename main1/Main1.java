package main1;
import Complex.newpackage.Complex;

public class Main1 {

    public static void main(String[] args){
           Complex complejo1 = new Complex(3,2);
           Complex complejo2 = new Complex(5,10);
           Complex complejo3 = new Complex(0,0);
           
           complejo3.sum(complejo1, complejo2);
           System.out.println("SUMA de Complejos");
           System.out.println("");
           System.out.println("La parte Real es: "+ complejo3.getReal());
           System.out.println("La parte Imaginaria es: "+complejo3.getImg()+" i ");
           complejo3.mult(complejo1, complejo2);
           System.out.println("");
           System.out.println("");
           System.out.println("PRODUCTO de Complejos");
           System.out.println("");
           System.out.println("La parte Real es: "+ complejo3.getReal());
           System.out.println("La parte Imaginaria es: "+complejo3.getImg()+" i ");
        
    }
    
}
