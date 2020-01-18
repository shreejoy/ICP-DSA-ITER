import java.util.*;
public class Q2 {
	int num;

	Q2() {
		// default value
		num = 2;
	}
	
	Q2(int n) {
		num = n;
	}
	
	int check() {
		int count = 0;
		while (num > 2) {
			num = num/2;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number greater than 2");
		int num = sc.nextInt();
	    Q2 val = new Q2(num);
	    int count = val.check();
	    System.out.println("The number "+num+" can be divided "+(count + 1)+" times to get a number less than 2");
	}

}
