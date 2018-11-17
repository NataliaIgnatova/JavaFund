import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("java");
		list.add("one");
		list.add(1);
		list.add(new Character('J'));
		System.out.println("contains "+list.contains("java"));
		System.out.println("index of: "+list.indexOf(1));
		System.out.println("size "+list.size());
		for(Object o:list){
			System.out.println(o);
		}
		System.out.println(list.remove("one"));
		List secondList = new ArrayList();
		secondList.add("three");
		secondList.add(3);
		secondList.addAll(list);
		for(Object o:secondList){
			System.out.println(o);
		}
		
		
		
	}

}
