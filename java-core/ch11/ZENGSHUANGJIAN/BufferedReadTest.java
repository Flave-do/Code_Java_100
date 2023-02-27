package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class BufferedReadTest {

	
	public static String fileContent ="";
	public static void main(String[] args) {

	
		User u = null;
		Map map = new HashMap();
		
		
		map.put("1", "dfdf");
		map.put("2", "dfdff");
	
		map.put("4", "dfdfs");
		System.out.println(map.size());
		
		
		BufferedReader br = null;

		int k = 0;
		try {

			// br = new FileWriter("src/io/passwd");
			br = new BufferedReader(new FileReader("src/io/passwd"));

			String input = null;
			String[] b = null;

			// System.out.println("总共的行数="+k);

			while ((input = br.readLine()) != null) {

				//if((input = br.readLine()) = '\n')
				fileContent +=input;
				b = input.split(":");

				u = new User(b[0], b[1], b[2], b[3]);

				 for (int i = 7; i < 20; i++) {
						
//						map.put("i", new String(b[0]));
						map.put(i, u.getHome());
					}
				
				
				
				System.out.println(u.find(b[0]));

			}
		//	System.out.println("jj="+fileContent);
			

			
			 
			 System.out.println(map.size());
			//map.put("1", new String(b[0]));
			//System.out.println(map.isEmpty());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(map.size());

	}
}

// System.out.println(input.length());
// System.out.println(b.length);

// for (int i = 0; i < 10; i++) {
//
// map.put("i", new String (b[0]));
// System.out.println(map.get(0));
// }
// map.put("1", new String (b[0]));
// System.out.println(map.isEmpty());

// System.out.println(map.size());
