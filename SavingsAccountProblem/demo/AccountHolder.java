package Workshop_2.SavingsAccountProblem.demo;

import Workshop_2.SavingsAccountProblem.entity.SavingsAccount;

public class AccountHolder {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		int setAnnualInterestRate = 4;		// defining the annual interest rate
		SavingsAccount.annualInterestRate = setAnnualInterestRate;		// setting the annual interest rate

		System.out.println("Monthly savings for saver1 with Annual Interest = 4% "+saver1.calculateMonthlyInterest());		// calculating and printing the savings
		System.out.println("Monthly savings for saver2 with Annual Interest = 4% "+saver2.calculateMonthlyInterest());
		
		setAnnualInterestRate =5;
		SavingsAccount.modifyInterestRate(setAnnualInterestRate);		// modifying the interest rate
		
		System.out.println("Monthly savings for saver1 with Annual Interest = 5% "+saver1.calculateMonthlyInterest());		// calculating and printing the savings with modified rate
		System.out.println("Monthly savings for saver2 with Annual Interest = 5% "+saver2.calculateMonthlyInterest());

	}

}
