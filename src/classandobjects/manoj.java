package classandobjects;
class prasanth{
	void details() {
		System.out.println("This is method");
	}
	String name1() {
		String name="prasanth";
		return name;
	}
	int age1() {
		int age=55;
		return age;
	}
	prasanth(){
		System.out.println("This is constructor");
	}
	
}
class chinnu{
	int age=19;
	chinnu(int a,int b){
		System.out.println(a+b);
	}
}
public class manoj {
	public static void main(String[] args) {
		prasanth info=new prasanth();
		info.details();
		System.out.println(info.name1());
		System.out.println(info.age1());
		chinnu obj=new chinnu(2,2);
		System.out.println(obj.age);
	}

}
