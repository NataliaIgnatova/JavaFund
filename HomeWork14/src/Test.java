
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array<Integer> ints = new Array<>();
		ints.add(5);
		ints.add(7);
		ints.add(9);
		Integer i = ints.get(0);
		Array<String> strings = new Array<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		String s = strings.get(0);
		System.out.println(i.toString());
		System.out.println(s.toString());
	}

}
