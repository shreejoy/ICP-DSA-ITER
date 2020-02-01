/*
Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
*/

public class Q2 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();

		c1.setData(5, 6);
		c1.display();
		c2.setData(2, 3);
		c2.display();
		Complex c3 = new Complex();
		
		c3 = c1.add(c1, c2);
		c3.display();
	}

}
class Complex {
	int real;
	int imag;
	
	void setData(int r, int i)
	{
		real = r;
		imag = i;
	}
	void display() {
		System.out.println(real+" + "+imag+"i");
	}
	
	Complex add(Complex cx, Complex cy)
	{	
		Complex c3 = new Complex();
		c3.real = cx.real + cy.real;
		c3.imag = cx.imag + cy.imag;
		return c3;
	}
}
