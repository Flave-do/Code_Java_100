package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTalkServer extends Thread{
	Socket s;
	
	public MyTalkServer(Socket s){
		this.s = s;
	}
	
	@Override
	public void run() {
		try {
			doServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doServer() throws Exception{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		BufferedReader inKey = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Client say:"+br.readLine());
		String line = inKey.readLine();
		while(line!=null){
				pw.println(line);
				String content = br.readLine();
				System.out.println("Client say:"+content);
				line = inKey.readLine();
		}
		
		if(br!=null) br.close();
		if(pw!=null) pw.close();
		if(inKey != null) inKey.close();
		if(s != null)s.close();
	}
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8778);
			while(true){
				Socket s = ss.accept();
				System.out.println("有客户端连接");
				MyTalkServer ts = new MyTalkServer(s);
				ts.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
				try {
					if(ss!=null)	 ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
