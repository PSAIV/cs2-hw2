

import java.util.Date;


public class HW2_9_7 {
	
	public static class Account {
		
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated = new Date();
		
		Account() {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
		}
		Account(int id, double balance){
			this.id = id;
			this.balance = balance;
		}
		
		public int getId(){
			return id;
		}
		
		public void setId(int id){
			this.id = id;
		}
		
		public double getBalance(){
			return balance;
		}
		
		public void setBalance(double balance){
			this.balance = balance;
		}
		
		public double getAnnualInterestRate(){
			return annualInterestRate;
		}
		
		public void setAnnualInterestRate(double annualInterestRate){
			this.annualInterestRate = annualInterestRate / 100;
		}
		
		public Date getDateCreated(){
			return dateCreated;
		}
		
		public double getMonthlyInterestRate(){
			return annualInterestRate / 12;
		}
		
		public double getMonthlyInterest() {
			return getMonthlyInterestRate() * balance;
		}
		
		public void withdraw(int withdrawal) {
			balance -= withdrawal;
		}
		
		public void deposit(int deposit){
			balance += deposit;
		}
	}
	
	public static void main(String args[]){
		
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.printf("The balance is %f, the monthly interest is %f\n", a.getBalance(), a.getMonthlyInterest());
		System.out.print("This account was created on " + a.getDateCreated());
	}

}