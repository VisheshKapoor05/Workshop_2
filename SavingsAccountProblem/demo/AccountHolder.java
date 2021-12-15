package Workshop_2.SavingsAccountProblem.demo;

import Workshop_2.SavingsAccountProblem.entity.SavingsAccount;

public class AccountHolder {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		int setAnnualInterestRate = 4;
		SavingsAccount.annualInterestRate = setAnnualInterestRate;

		System.out.println("Monthly savings for saver1 with Annual Interest = 4% "+saver1.calculateMonthlyInterest());
		System.out.println("Monthly savings for saver2 with Annual Interest = 4% "+saver2.calculateMonthlyInterest());
		
		setAnnualInterestRate =5;
		SavingsAccount.modifyInterestRate(setAnnualInterestRate);
		
		System.out.println("Monthly savings for saver1 with Annual Interest = 5% "+saver1.calculateMonthlyInterest());
		System.out.println("Monthly savings for saver1 with Annual Interest = 5% "+saver2.calculateMonthlyInterest());

	}

}
