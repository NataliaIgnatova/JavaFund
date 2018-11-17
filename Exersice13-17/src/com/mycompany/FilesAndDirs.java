package com.mycompany;

import java.io.File;

public class FilesAndDirs {
	public static void search(String path) {
		File item = new File(path);
		File[] itemsList = item.listFiles();
		for (File f : itemsList) {
			if (f.isDirectory()) {
				search(f.getPath());
			} else if (f.isFile()) {
				System.out.println(f.getName());
			} else {
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		search("C:\\Users\\TALI\\Desktop");

	}

}
