package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket s=new Socket("172.16.5.6", 8989);
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println("asfasf");
//			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			pw.flush();
			pw.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
