package inheritence_concept;
class A{
	int a=20;
	void gill() {
		System.out.println("Parent class");
	}
}
class B extends A{
	int a=100;
	int h=30;
	void kite() {
		System.out.println("child class");
		System.out.println(super.a);
		System.out.println(a);
		super.gill();
	}
}
public class single_inheritance {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a);
		obj.gill();
		System.out.println(obj.h);
		obj.kite();
	
	}
	
}
