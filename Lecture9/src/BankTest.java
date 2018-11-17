
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSpecification savingAccMary = new SavingsAccount();
		AccountSpecification creditAccMary = new CreditAccount();
		Client mary = new Client("Mary",savingAccMary, creditAccMary);

		AccountSpecification savingAccBob = new SavingsAccount();
		AccountSpecification creditAccBob = new CreditAccount();
		Client bob = new Client("Bob",savingAccMary, creditAccMary);
		bob.depositCredit(100);
		bob.depositSavings(200);
		bob.withdrawCredit(50);
		bob.depositSavings(100);
		System.out.println("bob credit" + bob.getBalanceCredit());
		System.out.println("bob savings"+bob.getBalanceSavings());
		mary.depositCredit(200);
		mary.depositSavings(800);
		mary.withdrawCredit(100);
		mary.withdrawSavings(600);
		System.out.println("mary credit"+mary.getBalanceCredit());
		System.out.println("mary savings"+mary.getBalanceSavings());
		mary.transfer(savingAccMary, creditAccBob, 100);
		System.out.println("mary savings"+mary.getBalanceSavings());
		System.out.println("bob credit"+bob.getBalanceCredit());
		System.out.println(mary.getSavingsAccount().getAccountType());
		System.out.println(bob.getCreditAccount().getAccountType());
		
	}

}
