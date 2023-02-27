package prepare.io.eg;

import java.util.*;
import java.io.*;

public class TestPrintStream2 {
	public static void main(String[] args) {
		String s = null;
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		try {
			//i18n internationalization
			//log4j  log for java
			FileWriter fw = 
					new FileWriter("src/prepare/io/eg/logfile.log", true); // i18n
			PrintWriter log = new PrintWriter(fw);
			while ((s = br.readLine()) != null) {
				if (s.equalsIgnoreCase("exit"))
					break;//continue
				System.out.println(s.toUpperCase());
				log.println("-----");
				log.println(s.toUpperCase());
				log.flush();
			}
			log.println("last time" + new Date() + "===");
			log.flush();
			log.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}