package inheritence_concept;
class C{
	int a=10;
}
class D extends C{
	int b=30;
}
class E extends D{
	int c=40;
}
public class multilevel_inheritance {
	public static void main(String[] args) {
		E obj = new E();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		D ob = new D();
		System.out.println(ob.a);
		System.out.println(ob.b);
		C o=new C();
		System.out.println(o.a);
	}
}
