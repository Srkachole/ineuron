package ineuron.javaAssignment;

import java.util.Scanner;


interface shape{
	void area();
	void perimeter();
	Scanner sc = new Scanner(System.in);
	
}

class circle implements shape {
	int r;
	public circle() {
		System.out.println("Please enter the radius");
		r = sc.nextInt();
	}
	
	public void area() {
		
		double areaCircle = (22*r*r)/7;
		System.out.println("Area of circle : "+areaCircle);
	}
	
	public void perimeter() {
	
		int periCircle = (22*r*2)/7;
		System.out.println("Perimeter of circle : "+periCircle);		
	}
	
}

class triangle implements shape{
	int s1;
	int s2;
	int s3;
	int s; //semi-perimeter
	
	public triangle() {
		System.out.println("Please enter the Triangle Side 1:");
		s1 = sc.nextInt();
		System.out.println("Please enter the Triangle Side 2:");
		s2 = sc.nextInt();
		System.out.println("Please enter the Triangle Side 3:");
		s3 = sc.nextInt();
		
		//semi-perimeter
		s = (s1+s2+s3)/2;
	}
	
	public void area() {
		
		// Heron's Formula
		double areaTriangle = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); 
		System.out.println("Area of Triangle: "+areaTriangle);
	}
	
	public void perimeter() {
		
		int periTriangle = s1+s2+s3;
		System.out.println("Perimeter of Triangle: "+periTriangle);
	}	
}
public class Q1 {

	public static void main(String[] args) {
		
		shape c = new circle();
		c.area();
		c.perimeter();
		
		System.out.println("**********************************");
		
		shape t = new triangle();
		t.area();
		t.perimeter();
		
	}

}
