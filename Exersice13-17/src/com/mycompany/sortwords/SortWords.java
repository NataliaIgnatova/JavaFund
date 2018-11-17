package com.mycompany.sortwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator comparator = new MyComparator();
		SortedSet<String> words = new TreeSet<>(comparator);
		try (BufferedReader buffRead = new BufferedReader(
				new FileReader("C:\\Users\\TALI\\Desktop\\longestword.txt"))) {
			String line = buffRead.readLine();
			while (line != null) {
				words.add(line);
				line = buffRead.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error occured");
			Logger.getLogger(SortWords.class.getName()).log(Level.SEVERE, "Exception while close file", e);
		}
		
		for(String word:words){
			System.out.println(word);
		}

	}

}
