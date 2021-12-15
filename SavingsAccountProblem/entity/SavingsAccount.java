package Workshop_2.SavingsAccountProblem.entity;

public class SavingsAccount {
	
		public static int annualInterestRate;		// declaring annual interest rate common for all the objects
		private int savingsBalance;					// declaring savings balance as private

		public SavingsAccount(int savingsBalance){	// constructor to take value of savings balance
		this.savingsBalance = savingsBalance;
		}

		public int calculateMonthlyInterest(){		// calculating the savings with monthly interest
		savingsBalance = savingsBalance + (savingsBalance*annualInterestRate)/1200;
		return savingsBalance;
		}

		public static void modifyInterestRate(int annualInterestRate){		// method to modify the Interest Rate for all the accounts
		 SavingsAccount.annualInterestRate = annualInterestRate;
		}

}
