package prepare.io.eg;

import java.io.*;
public class TestTransForm1 {
  public static void main(String[] args) {
    try {
      OutputStreamWriter osw = new OutputStreamWriter(
           new FileOutputStream("src/prepare/io/eg/char.txt"),"GBK");
      osw.write("中文");
      System.out.println(osw.getEncoding());
      osw.close();
      osw = new OutputStreamWriter(
      								new FileOutputStream("src/prepare/io/eg/char.txt", true),
      								"GBK"); 
      osw.write("中文");
      System.out.println(osw.getEncoding());
      osw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}