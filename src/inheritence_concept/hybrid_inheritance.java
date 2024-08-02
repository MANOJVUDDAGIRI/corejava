package inheritence_concept;
class X{
	int x=30;
}
class Y extends X{
	float y=40f;
}
class Z extends Y{
	String z="manoj";
}
class W extends X{
	double w=123.321;
}
public class hybrid_inheritance {
	public static void main(String[] args) {
		Z ob1=new Z();
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println(ob1.z);
		System.out.println("=============");
		Y ob2 = new Y();
		System.out.println(ob2.x);
		System.out.println(ob2.y);
		System.out.println("=============");

		X ob3 = new X();
		System.out.println(ob3.x);
		System.out.println("=============");
		W ob4 = new W();
		System.out.println(ob4.w);
		System.out.println(ob4.x);
	
	}
	}
