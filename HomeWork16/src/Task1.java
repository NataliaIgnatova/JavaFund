import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<Book> bookList = new ArrayList<>();
		int count = 0;

		try (BufferedReader buffRead = new BufferedReader(new FileReader("c:\\Users\\TALI\\Desktop\\book.csv"))) {
			String line = buffRead.readLine();
			while (line != null) {
				String[] lineArr = line.split(";");
				if (count < lineArr.length) {
					Book b = new Book(Integer.parseInt(lineArr[count++]), lineArr[count++], lineArr[count++]);
					bookList.add(b);
					count = 0;
				}

				line = buffRead.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error occured");
			Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Exception while close file", e);
		}

		for (Book b : bookList) {
			System.out.println(b);
		}
		System.out.println("Plese enter your command!(q)-quit,(s)-search,(d)-delete,(a)-add");
		String userIn = in.nextLine();
		while (!userIn.equals("q")) {
			if (userIn.equals("s")) {
				System.out.println("Please enter a name:");
				String input = in.nextLine();
				for (Book b : bookList) {
					if (b.getName().toLowerCase().contains(input.toLowerCase())) {
						System.out.println("ID" + "  Name" + "  ISBN");
						System.out.println(b.getId() + "  " + b.getName() + "  " + b.getIsbn());
					}

				}
			} else if (userIn.equals("d")) {
				System.out.println("Please enter an Id: ");
				int input = in.nextInt();
				for (Book b : bookList) {
					if (b.getId() == input) {
						System.out.println("System is remove: " + b);
						bookList.remove(b);
						break;
					}
				}
				try (BufferedWriter buffWrite = new BufferedWriter(
						new FileWriter("c:\\Users\\TALI\\Desktop\\book.csv"))) {
					for (Book b : bookList) {
						System.out.println(b);
						buffWrite.write(b.getId() + ";" + b.getName() + ";" + b.getIsbn() + "\n");
					}
				} catch (IOException e) {
					Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Exception while closing file", e);
				}
			} else if (userIn.equals("a")) {
				System.out.println("Please enter new book: ");
				String line = in.nextLine();
				String[] lines = line.split(";");
				if (count < lines.length) {
					Book b = new Book(Integer.parseInt(lines[count++]), lines[count++], lines[count++]);
					bookList.add(b);
					count = 0;
				}
				try (BufferedWriter buffWrite = new BufferedWriter(
						new FileWriter("c:\\Users\\TALI\\Desktop\\book.csv"))) {
					for (Book b : bookList) {
						System.out.println(b);
						buffWrite.write(b.getId() + ";" + b.getName() + ";" + b.getIsbn() + "\n");
					}
				} catch (IOException e) {
					Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Exception while closing file", e);
				}
			}
			System.out.println("Plese enter your command!!(q)-quit,(s)-search,(d)-delete,(a)-add");
			userIn = in.nextLine();
		}
		if (userIn.equals("q")) {
			try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("c:\\Users\\TALI\\Desktop\\book.csv"))) {
				for (Book b : bookList) {
					System.out.println(b);
					buffWrite.write(b.getId() + ";" + b.getName() + ";" + b.getIsbn() + "\n");
				}
			} catch (IOException e) {
				Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Exception while closing file", e);
			}
		}

	}

}
