package statements;

import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age>=1 && age<=10) {
			System.out.println("you are child");
		}
		else if(age>=11 && age<=17) {
			System.out.println("you are teeneger");
		}
		else if(age>=18 && age<=30) {
			System.out.println("you are young");
		}
		else if(age>30) {
			System.out.println("you are old");
		}
		else {
			System.out.println("Invalid");
		}
}
}