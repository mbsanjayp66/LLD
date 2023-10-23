package com.sanjay.CompositePattern2;

public class Main {

	public static void main(String[] args) {
		FileSystem file = new File("Halchal");
		Directory dirFileSystem  = new Directory("tere Nam");
		dirFileSystem.add(file);
		Directory dir2 = new Directory("the Flash");
		FileSystem file2 = new File("Avene");
		dir2.add(file2);
		dirFileSystem.add(dir2);
		dirFileSystem.ls();
	}

}
