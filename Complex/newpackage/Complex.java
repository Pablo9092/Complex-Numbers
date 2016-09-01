
package Complex.newpackage;


public class Complex {
    private double real;
    private double img;
    
    public Complex(){
        
    }
    
    public Complex(double r, double i){
        this.real=r;
        this.img=i;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }
    
    public void sum(Complex a, Complex b){
        this.real=a.getReal()+b.getReal();
        this.img=a.getImg()+b.getImg();
    }
   public void res(Complex a, Complex b){
        this.real=a.getReal()-b.getReal();
        this.img=a.getImg()-b.getImg();
    }

    public void mult(Complex a, Complex b){
        this.real=(a.getReal()*b.getReal())-(a.getImg()*b.getImg());
        this.img=(a.getReal()*b.getImg())+(a.getImg()*b.getReal());
    }

} 
