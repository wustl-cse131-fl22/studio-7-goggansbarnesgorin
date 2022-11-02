package studio7;

////A complex number has a real and imaginary part, each represented as a double. 
//A complex should be able to add itself to another complex number, returning a new complex number as the sum (see below). 
//Similarly, a complex number should be able to multiply itself by another complex number, 
//returning a new complex number as the product.
//
//A complex number with real part a and imaginary part b is usually shown as a + bi.
//
//The result of adding two complex numbers, x and y , is another complex number whose real 
//part is the sum of the real parts of x and y and whose imaginary part is the sum of the imaginary 
//parts of x and y.
//
//The product of two imaginary numbers, like (a+bi)×(c+di), is (ac−bd)+(ad+bc)i

public class Complex {
	
	private double a;
	private double b;
	
	public Complex(int isA, int isB) {
		a = isA;
		b = isB;
	}
	
	public String Sum(Complex c)
	{
		return (c.a + a) + " + " + (c.b + b) + "i";
	}
	public String Product(Complex c)
	{
		return ((a*c.a)-(b*c.b)) + " + " + ((a*c.b)+(b*c.a)) + "i";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Complex c1 = new Complex(2,3);
			Complex c2 = new Complex(2,3);
			System.out.print(c1.Product(c2));
	}

}
