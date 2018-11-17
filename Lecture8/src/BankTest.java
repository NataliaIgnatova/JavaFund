import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankTest {

	public static void main(String[] args) throws AccountBalanceException, SecurityException, IOException {
		// TODO Auto-generated method stub
		Logger logger = null;
		Handler handler = new FileHandler("C:\\Users\\TALI\\Desktop\\file.dat");
		logger = Logger.getLogger("logger.name");
		logger.addHandler(handler);
		Account maryCreditAcc = new Account(200);
		Account marySavingsAcc = new Account(500);
		Account bobCreditAcc = new Account(600);
		Account bobSavingsAcc = new Account(800);
		Client mary = new Client("Mary", marySavingsAcc, maryCreditAcc);
		Client bob = new Client("Bob", bobSavingsAcc, bobCreditAcc);
		bob.depositCredit(300);
		bob.depositSavings(400);
		mary.depositCredit(400);
		mary.depositSavings(800);
		System.out.println(mary.getBalanceCredit());
		System.out.println(mary.getBalanceSavings());
		System.out.println(bob.getBalanceCredit());
		System.out.println(bob.getBalanceSavings());
		bob.withdrawCredit(150);
		System.out.println(bob.getBalanceCredit());
		bob.withdrawSavings(220);
		System.out.println(bob.getBalanceSavings());
		mary.withdrawCredit(400);
		System.out.println(mary.getBalanceCredit());
		mary.withdrawSavings(180);
		System.out.println(mary.getBalanceSavings());
		try {
			mary.transfer(marySavingsAcc, bobCreditAcc, 200);
		} catch (AccountBalanceException ex) {
			ex.getMessage();
			StackTraceElement[] elements = ex.getStackTrace();
			for (int i = 0; i <= elements.length; i++) {
				logger.log(Level.WARNING, elements[i].getMethodName());
			}
		}
		try {
			bob.transfer(bobCreditAcc, bobSavingsAcc, 400);
		} catch (AccountBalanceException ex) {
			ex.getMessage();
			StackTraceElement[] elements = ex.getStackTrace();
			for (int i = 0; i <= elements.length; i++) {
				logger.log(Level.WARNING, elements[i].getMethodName());
			}
		}
		System.out.println("mary credit acc " + mary.getBalanceCredit());
		System.out.println("mary savings acc " + mary.getBalanceSavings());
		System.out.println("bob credit acc " + bob.getBalanceCredit());
		System.out.println("bob savings acc " + bob.getBalanceSavings());

	}

}
