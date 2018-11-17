package com.mycompany.longestWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<>();
		String longestWord = " ";
		try(BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\TALI\\Desktop\\longestword.txt"))){
			String line = buffRead.readLine();
			while(line != null){
				words.add(line);
				line = buffRead.readLine();
			}
		}catch(IOException e){
			System.out.println("Error occured");
			Logger.getLogger(LongestWord.class.getName()).log(Level.SEVERE, "Exception while close file", e);
		
		}

		System.out.println("Words:");
		for(String word:words){
			if(word.length() > longestWord.length()){
				longestWord = word;
			}
			System.out.println(word);
		}
		System.out.println("Longest word is: "+longestWord); 
	}

}
