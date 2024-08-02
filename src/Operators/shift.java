package Operators;

import java.util.Scanner;

public class shift {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		byte a=sc.nextByte();
		System.out.println("Enter b vaue");
		byte b=sc.nextByte();
		byte c=(byte)(a<<b);
		int d=(byte)(a>>b);
		byte e=(byte)(a>>>b);
		System.out.println("The left shift is: "+c);
		System.out.println("The right shift is: "+d);
		
	}

}
