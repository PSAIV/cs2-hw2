

import java.util.Date;


class Account {
	
	//Fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	//Default Constructor
	Account() {
		setId(0);
		setBalance(0);
		setAnnualInterestRate(0);
	}
	
	//Constructor
	Account(int id, double balance){
		setId(id);
		setBalance(balance);
	}
	
	//Id getter/setter
	public int getId(){
		return id;
	}
		
	public void setId(int i){
		id = i;
	}
	
	//Balance getter/setter
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double b){
		balance = b;
	}
	
	//annualInterestRate getter/setter
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double a){
		annualInterestRate = a;
	}
	
	//DateCreated getter
	public Date getDateCreated(){
		return dateCreated;
	}
	
	//Derived methods			
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