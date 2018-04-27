public class Complex
{
    private double real;
    private double imag;
    public Complex(double r, double i)
    {
        real = r;
        imag = i;
    }

    public double getReal() // returns the real part of this Complex number 
    public double getImag() // returns the imaginary part of this Complex number 
    public String toString() // returns this Complex number in the form a + bi
    
    public Complex add(Complex b) // returns the sum of this Complex number and Complex number b
    public Complex sub(Complex b) // returns the difference of this Complex number and Complex number b
    public double abs() // returns the absolute value of this Complex number
    public Complex conj() // returns the conjugate of this Complex number
    public Complex scale(double b) // multiplies this Complex number by a real number b
    public Complex mult(Complex b) // multiplies this Complex number by Complex number b
    public Complex div(Complex b) // divides this Complex number by Complex number b
    public double angle() // returns the angle, in radians, of the line from the origin to this Complex number
    
    /** static methods **/
    public static Complex add(Complex a, Complex b) // returns the sum of Complex numbers a and b
    public static Complex sub(Complex a, Complex b) // returns the difference of Complex numbers a and b
    public static double abs(Complex a)  // returns the absolute value of Complex number a
    public static Complex conj(Complex a) // returns the conjugate of Complex number a
    public static Complex scale(Complex a, double b) // multiplies Complex number a by real number b
    public static Complex mult(Complex a, Complex b)  // multiplies Complex number a by Complex number b
    public static Complex div(Complex a, Complex b) // divides Complex number a by Complex number b
    public static Complex exp(Complex a) // raises e to the power of Complex number a
    public static double angle(Complex a) // returns the angle, in radians, of the line from the origin to Complex number a
    public static void mainStatic() // tester for static methods
    public static void mainObjecty() // tester for nonstatic methods
}
