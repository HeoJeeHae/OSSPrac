package ossp1;
import java.util.Scanner;
public class ossprac {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("학번을 입력하세요: ");
		int num = sc.nextInt();
        System.out.print("학과를 입력하세요: ");
		String ma = sc.next();
		System.out.print("학교를 입력하세요: ");
		String sh = sc.next();
		System.out.print("학년를 입력하세요: ");
		int gr = sc.nextInt();
		System.out.println("\n"+ "<출력>");
		System.out.println("이름: "+ name);
		System.out.println("학번: "+ num);
        System.out.println("학과: "+ ma);
		System.out.println("학교: "+ sh);
		System.out.print("학년: "+ gr);
		sc.close();
	}
}
