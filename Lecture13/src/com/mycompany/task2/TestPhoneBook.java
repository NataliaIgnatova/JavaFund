package com.mycompany.task2;

import java.io.FileNotFoundException;

public class TestPhoneBook {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PhoneBookItem item = new PhoneBookItem("ivan","12324");
		PhoneBookItem item1 = new PhoneBookItem("maria","23412324");
		PhoneBookItem item2 = new PhoneBookItem("dragan","1232456");
		
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.insert(item);
		phoneBook.insert(item1);
		phoneBook.insert(item2);
		phoneBook.lookUp("iv");
		//phoneBook.lookUp("iv", item1);
		phoneBook.delete();
		phoneBook.printPhoneBook();
	}

}
