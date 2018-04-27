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

    public String toString()
    {
        return "" + real + " + " +  imag + "i";
    }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex(a.getReal() + b.getReal(),a.getImag() + b.getImag());
    }

    public static Complex sub(Complex a, Complex b)
    {
        return new Complex(a.getReal() - b.getReal(),a.getImag() - b.getImag());
    }
    
    public static double abs(Complex a)
    {
        return Math.sqrt(a.getReal()*a.getReal() + a.getImag()*a.getImag());
    }
    
    public static Complex conj(Complex a)
    {
        return new Complex(a.getReal() , -a.getImag());
    }
    
    public static Complex scale(Complex a, double b)
    {
        return new Complex(a.getReal()*b,a.getImag()*b);
    }
    
    public static Complex mult(Complex a, Complex b)
    {
        return new Complex(a.getReal()*b.getReal() - a.getImag()*b.getImag(), a.getReal()*b.getImag() + b.getReal()*a.getImag());
    }
    
    public static Complex div(Complex a, Complex b)
    {
        Complex num = Complex.mult(a,Complex.conj(b));
        return Complex.scale(num , 1/(Complex.abs(b)*Complex.abs(b)));
    }
    
    public static Complex exp(Complex a)
    {
        double imag = a.getImag();
        double real = a.getReal();
        return new Complex(Math.exp(real)*Math.cos(imag) , Math.exp(real)*Math.sin(imag));
    }

    public static void main()
    {
        Complex a = new Complex(Math.sqrt(.5),Math.sqrt(.5));
        Complex b = new Complex(Math.sqrt(.75),.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println("A Conj: "+Complex.conj(a));
        System.out.println("A Real: "+a.getReal());
        System.out.println("B Real: "+b.getReal());
        System.out.println("B Imag: "+a.getImag());
        System.out.println("B Imag: "+b.getImag());
        System.out.println("A abs: " + Complex.abs(a));
        System.out.println("B abs: " + Complex.abs(b));
        System.out.println("Add: "+Complex.add(a,b));
        System.out.println("Sub: "+Complex.sub(a,b));
        System.out.println("Mult: "+Complex.mult(a,b));
        System.out.println("Div: "+Complex.div(a,b));
        System.out.println("Exp: "+Complex.exp(a));
        System.out.println("e^ipi: " + Complex.exp(new Complex(0,Math.PI)));
    }
}