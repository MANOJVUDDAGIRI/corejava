package Abstraction;
abstract class A{
	 int a=30;
	 static int b=40;
	 abstract void fun();
	 static void fact() {
		System.out.println("This is static fact method"); 
	 }
	 A(){
		 System.out.println("This is A constructor");
	 }
}
class B extends A{
	void fun() {
		System.out.println("fun method of abstraction");
	}
}
public class abstract_concept {
	public static void main(String[] args) {
		B ob1 = new B();
		System.out.println(ob1.a);
		System.out.println(A.b);
		ob1.fun();
		A.fact();
	}
}
