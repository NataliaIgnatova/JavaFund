import java.util.*;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String userIn = input.nextLine();
		String[] userInput = userIn.split(" ");
		List<String> words = new ArrayList<String>();
		Set<String> unique = new HashSet<>();
		Set<String> nonUnique = new HashSet<>();
		for(String s:userInput){
			words.add(s);
		}
		Collections.sort(words);
		for(String s:words){
			if(unique.contains(s)){
				nonUnique.add(s);
			}else{
				unique.add(s);
			}
		}
		unique.removeAll(nonUnique);
		for(String s:words){
			System.out.println("word: "+s);
		}
		for(String s:unique){
			System.out.println("unique: "+s);
		}
		for(String s:nonUnique){
			System.out.println("Nonunique: "+s);
		}
	}
}
