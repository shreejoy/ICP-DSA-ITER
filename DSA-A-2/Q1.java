/*
A sales person is paid commission based on the sales he makes as shown by the following
table:
                                           SALE  | COMMISSION
					   ------------------
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

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sales amount?");
		System.out.print("   > ");
		Scanner sc = new Scanner(System.in);
		int sales = sc.nextInt();
		if (sales < 0)
		{
			System.out.println("Invalid Input");
		}
		else {
			Commission c1 = new Commission(sales);
		    double commission =  c1.getCommission();
		    System.out.println("The commision is "+commission);
		}
	}

}

class Commission {
	int sales;double c = 0;
	Commission() { }
	
	Commission(int s) {
		sales = s;
	}
	
	double getCommission() {
		if(sales>0 && sales<500)
			 return (sales*2)/100;
		else if(sales>500 && sales<5000)
			return sales*0.05;
		else
			return sales*0.08;
		
		
	}
}
