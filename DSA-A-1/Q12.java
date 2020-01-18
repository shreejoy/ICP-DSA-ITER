class Flower {
	String name;
	int cpetal;
	double price;
	
	void f_name(String n) {
		name = n;
	}
	
	void f_petal(int c) {
		cpetal = c;
	}
	
	void f_price(double p) {
		price = p;
	}
	void input(String n, int c, double p) {
		f_name(n);
		f_petal(c);
	    f_price(p);
	}
	void display() {
		System.out.println("name = "+name+"\nnumber of petals = "+cpetal+"\nprice = "+price+"\n");
	}	
}

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower();
		
		f1.input("Rose",25,15);
		f2.input("Mariegold", 150, 2);
		f3.input("Dalia", 50, 30);
		
		f1.display();
		f2.display();
		f3.display();
	}

}
