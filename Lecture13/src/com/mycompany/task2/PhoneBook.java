package com.mycompany.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PhoneBook {

	private ArrayList<PhoneBookItem> phoneBook = new ArrayList<>();;
	private PhoneBookItem lastFound;

	public PhoneBook() {

	}

	public void insert(PhoneBookItem item) {
		phoneBook.add(item);
	}

	public void lookUp(String prefix) throws FileNotFoundException {

		for (PhoneBookItem p : phoneBook) {
			if (p.getName().startsWith(prefix)) {
				this.lastFound = p;
				System.out.println("LookUp for name: " + p.getName() + " number: " + p.getNumber());
				break;
			} else {
				throw new FileNotFoundException();
			}
		}
	}

	public void delete() {
		this.phoneBook.remove(lastFound);
	}

	public void printPhoneBook() {
		for (PhoneBookItem p : phoneBook) {
			System.out.println("name: " + p.getName() + " number: " + p.getNumber());
		}
	}

}
