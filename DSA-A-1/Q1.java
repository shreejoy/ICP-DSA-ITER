import java.util.*;
public class Q1 {
	int a;
	int b;
	int c;
	
	Q1() {}
	Q1(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}
	
	void add_check() {
		if (a == b + c) {
			System.out.println("The provided digits has passed the arthimetic check of a = b + c");
		}
		else {
			System.out.println("The provided digits has failed the arthimetic check of a = b + c");
		}
	}
	
	void sub_check() {
		if (a == b -c) {
			System.out.println("The provided digits has passed the arthimetic check of a = b - c");
		}
		else {
			System.out.println("The provided digits has failed the arthimetic check of a = b - c");
		}
	}
	
	void mul_check() {
		if (a * b == c) {
			System.out.println("The provided digits has passed the arthimetic check of a * b == c");
		}
		else
			System.out.println("The provided digits has failed the arthimetic check of a * b == c");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three digits for a, b, c?");
		System.out.println();
		System.out.print("a > ");
		int a = sc.nextInt();
		System.out.print("b > ");
		int b = sc.nextInt();
		System.out.print("c > ");
		int c = sc.nextInt();
		
		Q1 input1 = new Q1(a, b, c);
		
		input1.add_check();
		input1.sub_check();
		input1.mul_check();
	}

}
