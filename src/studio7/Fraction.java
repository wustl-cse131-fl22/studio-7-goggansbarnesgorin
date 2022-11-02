package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	private double fraction;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
		fraction = (double) n/d;
	}
	
	public double Sum(Fraction f) {
		return fraction + f.fraction;
	}
	
	public double Multiply(Fraction f) {
		return fraction * f.fraction;
	}
	
	public double Reciprocal() {
		return (double) denominator/numerator;
	}
	
	public String simplify() {
		// find GCF
		int GCF = 1;
		for(int i=1; i<= numerator && i<= denominator; i++)
		{
			if(numerator % i == 0 && denominator%i == 0) {
				GCF =i;
			}
		}
		// find new numerator numerator and denominator 
		int newNumerator = numerator / GCF;
		int newDenominator = denominator / GCF;
		
		//return new fraction as string
		return newNumerator + "/" + newDenominator;
		
	}
}
