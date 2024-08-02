package classandobjects;
class max{
	int a=10;
	float b=10.4f;
	void min() {
		System.out.println("max class");
	}
	int max1(){
		int x=90;
		int y=100;
		int rel=x+y;
		return rel;
	}
	void ben() {
		System.out.println("ben method");
	}
	max(){
		System.out.println("this constructor");
	}             
}

public class classexample {
	public static void main(String[] args) {
		max obj=new max();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.max1());
		obj.min();
		obj.ben();
	}

}
