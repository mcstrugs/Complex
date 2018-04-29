public class Complex
{
    private double real;
    private double imag;
    public static Complex I = new Complex(0,1);
    public static Complex NI = new Complex(0,-1);
    public static Complex ZERO = new Complex(0,0);
    public static Complex ONE = new Complex(1,0);
    public static Complex NONE = new Complex(-1,0);
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
    
    public Complex add(Complex b)
    {
        return Complex.add(this,b);
    }
    
    public Complex sub(Complex b)
    {
        return Complex.sub(this,b);
    }
    
    public double abs()
    {
        return Complex.abs(this);
    }
    
    public Complex conj()
    {
        return Complex.conj(this);
    }
    
    public Complex scale(double b)
    {
        return Complex.scale(this,b);
    }
    
    public Complex mult(Complex b)
    {
        return Complex.mult(this,b);
    }
    
    public Complex div(Complex b)
    {
        return Complex.div(this,b);
    }
    
    public double angle()
    {
        return Complex.angle(this);
    }
    
    public Complex ln()
    {
        return Complex.ln(this);
    }
    
    public Complex pow(Complex b)
    {
        return Complex.pow(this,b);
    }

    /** static methods **/
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
        return Math.hypot(a.getReal(),a.getImag());
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
    
    public static double angle(Complex a)
    {
        return Math.atan2(a.getImag(),a.getReal());
    }
    
    public static Complex ln(Complex a)
    {
        return new Complex(Math.log(Complex.abs(a)),Complex.angle(a));
    }
    
    public static Complex pow(Complex a, Complex b)
    {
        return Complex.exp(Complex.mult(Complex.ln(a),b));
    }

    public static void mainStatic()
    {
        Complex a = new Complex(Math.sqrt(.5),Math.sqrt(.5));
        Complex b = new Complex(Math.sqrt(.75),.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println("A Conj: "+Complex.conj(a));
        System.out.println("A Real: "+a.getReal());
        System.out.println("B Real: "+b.getReal());
        System.out.println("B Imag: "+a.getImag());
        System.out.println("A Imag: "+b.getImag());
        System.out.println("A abs: " + Complex.abs(a));
        System.out.println("B abs: " + Complex.abs(b));
        System.out.println("A angle: " + Complex.angle(a));
        System.out.println("Add: "+Complex.add(a,b));
        System.out.println("Sub: "+Complex.sub(a,b));
        System.out.println("Mult: "+Complex.mult(a,b));
        System.out.println("Div: "+Complex.div(a,b));
        System.out.println("Exp: "+Complex.exp(a));
        System.out.println("Ln: "+Complex.ln(a));
        System.out.println("a^b "+Complex.pow(a,b));
        System.out.println("i^i "+Complex.pow(Complex.I,Complex.I));
        System.out.println("e^ipi: " + Complex.exp(new Complex(0,Math.PI)));
    }
    
    public static void mainObjecty()
    {
        Complex a = new Complex(Math.sqrt(.5),Math.sqrt(.5));
        Complex b = new Complex(Math.sqrt(.75),.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println("A Conj: "+a.conj(a));
        System.out.println("A Real: "+a.getReal());
        System.out.println("B Real: "+b.getReal());
        System.out.println("A Imag: "+a.getImag());
        System.out.println("B Imag: "+b.getImag());
        System.out.println("A abs: " + a.abs(a));
        System.out.println("B abs: " + b.abs(b));
        System.out.println("A angle: " + a.angle());
        System.out.println("Add: "+a.add(b));
        System.out.println("Sub: "+a.sub(b));  
        System.out.println("Mult: "+a.mult(b));
        System.out.println("Div: "+a.div(b));
        System.out.println("Exp: "+Complex.exp(a));
        System.out.println("Ln: "+a.ln());
        System.out.println("a^b "+a.pow(b));
        System.out.println("i^i "+ Complex.I.pow(Complex.I));
        System.out.println("e^ipi: " + Complex.exp(new Complex(0,Math.PI)));
    }
}