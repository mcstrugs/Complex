public class Complex
{
    private double real;
    private double imag;
    public Complex(double r, double i)
    {
        real = r;
        imag = i;
    }
    
    public double getReal()
    {
        return real;
    }
    
    public double getImag()
    {
        return imag;
    }
    
    public static Complex add(Complex a, Complex b)
    {
        return new Complex(a.getReal() + b.getReal(),a.getImag() + b.getImag());
    }
    
    public static Complex sub(Complex a)
    {
    }
}