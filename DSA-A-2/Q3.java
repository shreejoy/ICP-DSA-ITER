/*
Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student . The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.
*/

import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam E1 []= new Exam[3];
		for(int i=0;i<3;i++) {
			E1[i]=new Exam();
		}
		for(int i=0;i<3;i++) {
			E1[i].input_students();
			E1[i].input_marks();
		}
		for(int i=0;i<3;i++) {
			E1[i].display_student();
			E1[i].display_marks();
		}
		
	}

}

class Student_new {
	String name;
	int roll;
	String course;
	Scanner sc=new Scanner (System.in);
	void input_students() {
		System.out.println("input student details");
		name =sc.next();
		course = sc.next();
		roll = sc.nextInt();
		
	}
	
	void display_student() {
		System.out.println(name+" => "+roll+" =>"+course);
	}	
}

class Exam extends Student_new {
	Scanner sc = new Scanner(System.in);
	int mark1;
	int mark2;
	int mark3;
	
	void input_marks() {
		System.out.println("input student marks");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
	}
	void display_marks() {
		System.out.println(mark1+" => "+mark2+" =>"+mark3);
	}	
	
	
}
