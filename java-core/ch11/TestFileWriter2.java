package com.briup.ch11;

import java.io.*;

public class TestFileWriter2 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/prepare/io/eg/TestFileWriter2.java");
		FileWriter fw = new FileWriter("src/prepare/io/eg/TestFileWriter2.bak");
		int b;
		while((b = fr.read()) != -1) {
			fw.write(b);
		}
		fr.close();
		fw.close();
	}
}