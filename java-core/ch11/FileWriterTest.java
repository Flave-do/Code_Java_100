package com.briup.ch11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
public static void main(String[] args) throws Exception {
	FileWriter fw=new FileWriter("src/xx",true);//append
	fw.write("埃索达");//log4j 
	fw.flush();
	fw.close();
}
}
