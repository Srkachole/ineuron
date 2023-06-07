package ineuron.javaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		boolean flag = true ;
		
		while(flag==true) {
			
			System.out.println("Do you want to add integers in List press \n1 = yes\n2 = no");
			int c = sc.nextInt();
			System.out.println("Current list : "+list);
			if(c==1) {
				System.out.println("Please enter the integers : ");
				int num = sc.nextInt();
				list.add(num);
			}
			else if(c==2){
				flag = false;
				break;
			}
			else {
				System.out.println("Enter the Correct Input");
				continue;
			}
		}
		Collections.sort(list);
		System.out.println("Sorted list : "+list);
		System.out.println("Second Smallest : "+list.get(1));
		int size = list.size();
		System.out.println("Second largest : "+ list.get(size-2));
	}

}
