package prepare.io.eg;

import java.io.*;

public class TestPrintStream1 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(
					"src/prepare/io/eg/log.dat");
			ps = new PrintStream(fos);
//			ps=new PrintStream(new FileOutputStream("xxx"));
//			ps=new PrintStream("src/xx");
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (ps != null) {
			System.setOut(ps);
		}
		int ln = 0;
		for (char c = 0; c <= 10000; c++) {
			System.out.print(c + " ");
			if (ln++ >= 100) {
				System.out.println();
				ln = 0;
			}
		}
	}
}
