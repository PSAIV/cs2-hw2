public class AccountTest {
		
	public static void main(String args[]){
		
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.printf("The balance is %f, the monthly interest is %f\n", a.getBalance(), a.getMonthlyInterest());
		System.out.print("This account was created on " + a.getDateCreated());
	}

}
