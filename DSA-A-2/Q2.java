/*
A sales person is paid commission based on the sales he makes as shown by the following
table:
                                           SALE  | COMMISSION
                                   Under Rs. 500 | 2% of SALES
                      Rs. 500 and under Rs. 5000 | 5% of SALES
                               Rs. 5000 and over | 8% of SALES
Write a class, Commission, which has:
* An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.

Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getcommission() method to get and print the commission. If the sales are
negative, your Demo class should print the message “Invalid Input”.
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
