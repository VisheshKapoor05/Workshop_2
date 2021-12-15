package Workshop_2.SavingsAccountProblem.entity;

public class SavingsAccount {
	
		public static int annualInterestRate;
		private int savingsBalance;

		public SavingsAccount(int savingsBalance){
		this.savingsBalance = savingsBalance;
		}

		public int calculateMonthlyInterest(){
		savingsBalance = savingsBalance + (savingsBalance*annualInterestRate)/1200;
		return savingsBalance;
		}

		public static void modifyInterestRate(int annualInterestRate){
		 SavingsAccount.annualInterestRate = annualInterestRate;
		}

}
