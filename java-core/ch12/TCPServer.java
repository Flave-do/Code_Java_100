package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket ss=null;
		//
		try {
			 ss=new ServerSocket(8989);
//			 while(true){
			 Socket s=ss.accept();//阻塞方法
			 System.out.println("有客户端连接！");
//			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
