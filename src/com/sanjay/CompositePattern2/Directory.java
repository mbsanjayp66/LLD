package com.sanjay.CompositePattern2;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	List<FileSystem> dir;
	String fileString;
	public Directory(String fileName) {
		this.fileString = fileName;
		dir = new ArrayList<>();
	}
	public void add(FileSystem file) {
		dir.add(file);
	}
	
	@Override
	public void ls() {
		System.out.println(fileString);
		for(FileSystem it:dir) {
			it.ls();
		}
	}

}
