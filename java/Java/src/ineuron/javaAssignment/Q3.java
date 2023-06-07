package ineuron.javaAssignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the positive Integer: ");
		try {
			int a = sc.nextInt();
			if(a>0) {
				System.out.println("The Integer is: "+a);
			}
			else {
				System.out.println("Please Enter integer greter than 0");
			}
		}
		catch(Exception e){
			System.out.println("Please Enter integer greter than 0");
		}
		
		sc.close();

	}

}
