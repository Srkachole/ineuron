package ineuron.javaAssignment;

import java.util.Scanner;

class User{
	static int balance=0;
	
	public void displayBalance() {
		System.out.println("Your account balance is: "+balance );;
		
	}
	
	public void moneyDeposite(int amt) {
		balance = balance+amt;
		System.out.println("Amount Deposited...");
		displayBalance();
	} 
	
	public void moneyWithdraw(int amt) {
		if(amt<balance) {
			System.out.println("Success...");
			balance = balance - amt;
			displayBalance();
		}
		else {
			if(balance == 0) {
				System.out.println("Please Deposite the money your balance: "+0);
			}
			else {
				System.out.println("Insufficient amount !!! Enter the samller amount.");
			}
		}
	}	
}

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			
			System.out.println("Please Select the Type of Transaction");
			System.out.println();
			System.out.println(
					"1.Check Balance"
					+ " 2.Money Deposite"
					+ " 3.Money Withdrawal"
					+ " 4.Exit"
							
					);
			System.out.println();
			System.out.println("Select the Transcation Number to perform banking");
			
			int option = sc.nextInt();
			
			User user = new User();
			if(option == 1) {
				user.displayBalance();
			}
			if(option == 2) {
				System.out.println("Enter the amount to be deposited");
				int amt = sc.nextInt();
				user.moneyDeposite(amt);
			}
			if(option == 3) {
				System.out.println("Enter the amount to be Withdrawn");
				int amt = sc.nextInt();
				user.moneyWithdraw(amt);
			}
			if(option == 4) {
				flag = false;
			}
		}
		sc.close();
	}

}
