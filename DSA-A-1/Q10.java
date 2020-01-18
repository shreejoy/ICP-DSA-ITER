class Student1 {
	int roll;
	String name;
	double mark;
	
	void setData(int r,String n,double m) {
		roll = r;
		name = n;
		mark = m;
	}
	
	void display() {
		System.out.println("name = "+name+"\nroll = "+roll+"\nmark = "+mark+"\n");
	}
}

public class Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		
		s1.setData(973, "Shreejoy Dash", 100);
		s2.setData(718, "Nalin Kant", 80);
		s3.setData(974, "Pratyush Pradhan", 84);
		
		s1.display();
		s2.display();
		s3.display();
	}

}

}
