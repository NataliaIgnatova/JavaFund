import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.nextLine();
		char[] letters = word.toLowerCase().toCharArray();
		int score=0;
		for(char c:letters){
			switch(c){
			case 'a': case 'e': case 'i': case 'o': case 'u': case 'l': case 'n': case 'r': case 's': case 't': 
				score++;
				System.out.println("1 point for "+c);
				break;
			case 'd': case 'g':
				score = score+2;
				System.out.println("2 point for "+c);
				break;
			case 'b': case 'c': case 'm': case 'p':
				score=score+3;
				System.out.println("3 point for "+c);
				break;
			case 'f': case 'h': case 'v': case 'w': case 'y':
				score=score+4;
				System.out.println("4 point for "+c);
				break;
			case 'k':
				score=score+5;
				System.out.println("5 point for "+c);
				break;
			case 'j': case 'x':
				score=score+8;
				System.out.println("8 point for "+c);
				break;
			case 'q': case 'z':
				score=score+10;
				System.out.println("10 point for "+c);
				break;
			}
				
		}
		System.out.println("for "+word +" score is: "+score);
	}

}
