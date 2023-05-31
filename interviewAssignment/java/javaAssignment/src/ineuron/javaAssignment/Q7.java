package ineuron.javaAssignment;

import java.util.Scanner;

class Users{
	
	public void binarySearch(int [] arr, int key ){
		
		int first = 0;
		int last = arr.length-1;
		int mid = (first+last)/2;
		
		while(first<=last) {
			if(key==arr[mid]) {
				System.out.println("Targeted key "+key+" is at: "+mid+" 5index");
				break;
			}
			else if(key>arr[mid]) {
				first = mid+1;
				mid = (first+last)/2;
			}
			else {
				last = mid-1;
				mid = (first+last)/2;
			}
			
			if(first>last) {
				System.out.println("Targeted key is not found !!!");
			}
		}
	}
}

public class Q7 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,5,6,7,8,9,12};
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the key to find from given array: ");
		int key = sc.nextInt();
	
		Users users = new Users();
		users.binarySearch(arr, key);
		
		sc.close();
	}

}
