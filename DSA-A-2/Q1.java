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
