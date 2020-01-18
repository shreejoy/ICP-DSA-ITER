import java.util.*;
class Student {
	int roll;
	String name;
	double mark;
	
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the roll > ");
		roll = sc.nextInt();
		System.out.println();
		System.out.print("Enter the name > ");
		name = sc.next();
		System.out.println();
		System.out.print("Enter the mark > ");
		mark = sc.nextInt();
		System.out.println();
	}
	
	void display() {
		System.out.println("name = "+name+"\nroll = "+roll+"\nmark = "+mark+"\n");
	}
}

public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setData();
		s2.setData();
		s3.setData();
		
		s1.display();
		s2.display();
		s3.display();
	}

}
