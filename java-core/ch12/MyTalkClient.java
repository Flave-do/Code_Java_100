package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyTalkClient {
	public static void main(String[] args) {
		Socket s = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		BufferedReader inKey = null;
		try {
			s = new Socket("127.0.0.1", 8778);
			pw = new PrintWriter(s.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			inKey = new BufferedReader(new InputStreamReader(System.in));
			
			String line = "hello Server";
			while(line!=null){
				if(!line.equals("bye")){
					pw.println(line);
					String content = br.readLine();
					System.out.println("Server say:"+content);
					line = inKey.readLine();
				}else{
					break;
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
				try {
					if(pw!=null)pw.close();
					if(br!=null)br.close();
					if(inKey!=null)inKey.close();
					if(s!=null) s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
