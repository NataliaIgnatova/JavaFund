import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words =input.split(" ");
		Map<String,Integer> wordFrequency = new HashMap<>();
		for(String s:words){
			if(wordFrequency.containsKey(s)){
				int value = wordFrequency.get(s)+1;
				wordFrequency.replace(s, wordFrequency.get(s), value);
			}else{
				wordFrequency.put(s,1);
			}
		}
		for(Object key:wordFrequency.keySet()){
			Object value = wordFrequency.get(key);
			System.out.println("wordFrequency: "+key+" " + value);
		}
		wordFrequency.forEach((e,i)->System.out.println(e+" "+i));
	}

}
