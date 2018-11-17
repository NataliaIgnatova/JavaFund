import java.math.BigDecimal;

public class Lec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 8;
		int b = 10;
		long c = 500;
		
		int res = (int) (a+b+c);
		
		BigDecimal first = new BigDecimal("0.1");
		BigDecimal second = new BigDecimal("0.6");
		BigDecimal sum = first.add(second);
		
		BigDecimal result = new BigDecimal("0.7");
		System.out.println("Sum = " + sum);
		System.out.println("Result = " + result);
		System.out.println("Is equal: " + result.equals(sum));
	}

}
