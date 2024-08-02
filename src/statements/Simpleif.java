package statements;
import java.util.Scanner;
public class Simpleif {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age==60) {
			System.out.println("you are is matched");
		}
		else {
			System.out.println("your age is not matched");
		}
	}

}
