package lab08;

public class Complex {
    private double real ;
    private double imag ;

    public Complex() {
        real = 0.0;
        imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public void addComplex(Complex n2){
        double r = this.real + n2.real;
        double i = this.imag + n2.imag;
        System.out.println("real = "+r);
        System.out.println("imag = "+i+" i ");
    }
    
    public void multComplex(Complex n2){
        double r = (this.real * n2.real) - (this.imag * n2.imag) ;
        double i = (this.real * n2.imag) + (this.imag * n2.real);
        System.out.println("real = "+r);
        System.out.println("imag = "+i+" i ");
    }

    @Override
    public String toString() {
        return "Complex{" + "real = " + real + ", imag = " + imag + "i }";
    }
}
