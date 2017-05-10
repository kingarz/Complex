package complex;
import static java.lang.Math.*;


public class Complex {
	double real;
	double imaginary;
	Complex(){}
	Complex(double re, double im)
	{
		real = re;
		imaginary = im;
	}
	Complex addition(final Complex a)
	{
		this.real += a.real;
		this.imaginary += a.imaginary;	
		return this;
	}
	Complex subtraction(final Complex a)
	{
		this.real -= a.real;
		this.imaginary -= a.imaginary;
		return this;
	}
	Complex multiplication(final Complex a)
	{
		Complex result = new Complex();
		result.real = this.real*a.real - this.imaginary*a.imaginary;
		result.imaginary = this.real*a.imaginary + this.imaginary*a.real;
		return result;
	}
	double modulus(final Complex a)
	{
		return sqrt(pow(a.real,2)+ pow(a.imaginary,2));
	}
	Complex division(final Complex a) 
	{
		if(modulus(a) <=0 || modulus(this) <=0)
		{
			throw new RuntimeException("the divisor can't be 0");
		}
		else
		{
		Complex result = new Complex();
		result.real = (this.real*a.real + this.imaginary*a.imaginary)/modulus(a);
		result.imaginary = (this.imaginary*a.real - this.real*a.imaginary)/modulus(this);
		return result;
		}
	}
}
