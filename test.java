import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        //true
        boolean c = a == 6 && b == 6;/*true
        false*/
        //true
        boolean e = (a + b)%6 == 0;
        System.out.println(c);
        System.out.println(e);
        sc.close();
	}
}