import java.util.Scanner;

class Account {
	String custName;
	int accNumber;
	
	Account(String custName, int accNumber) {
		this.custName = custName;
		this.accNumber = accNumber;
	}
	
	void display() {
		System.out.println("Customer Name: "+custName);
		System.out.println("Account number: "+accNumber);
	}
}

class Savings_account extends Account {
	double min_bal;
	double saving_bal;
	
	Savings_account(String custName, int accNumber, double min_bal, double saving_bal) {
		super(custName, accNumber);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
	}
	
	void show() {
		super.display();
		System.out.println("Minimum balance: "+min_bal);
		System.out.println("Saving balance: "+saving_bal);
	}
}

class Account_details extends Savings_account {
double deposit;
    	double withdrawal;

Account_details(String custName, int accNumber, double min_bal, double saving_bal, double deposit, double withdrawal) {
        		super(custName, accNumber, min_bal, saving_bal);
        		this.deposit = deposit;
        		this.withdrawal = withdrawal;
    	}
	
	void show1() {
		super.show();
		System.out.println("Deposit Amount: " + deposit);
       	 	System.out.println("Withdrawal Amount: " + withdrawal);
		double updatedBalance = saving_bal + deposit - withdrawal;
		System.out.println("Updated Balance: " + updatedBalance);
    	}
}

class BankRecords {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the customer name: ");
		String name = sc.nextLine();
		System.out.print("Enter Account Number: ");
            	int accNo = sc.nextInt();
        		System.out.print("Enter Minimum Balance: ");
       		double minBal = sc.nextDouble();
        		System.out.print("Enter Saving Balance: ");
        		double savBal = sc.nextDouble();
        		System.out.print("Enter Deposit Amount: ");
        		double deposit = sc.nextDouble();
        		System.out.print("Enter Withdrawal Amount: ");
       		double withdrawal = sc.nextDouble();
		
		Account_details acc = new Account_details(name, accNo, minBal, savBal, deposit, withdrawal);
		
		System.out.println("\n----- Customer Account Details -----");
		acc.show1();
	}
}
