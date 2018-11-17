
public class Upr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I like to drink water.";
		String[] split = str.split("\\s");

		for(String s:split){
			StringBuilder string = new StringBuilder(s);
			string.append(" ");
			String some = string.toString();
			String subs =some.substring(0, some.length()-1);
			subs.replaceAll(" ", "%");
			System.out.print(str.length());
		}
	}

}
