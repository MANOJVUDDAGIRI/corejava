package inheritence_concept;
class Animal{
	void sleep() {
		System.out.println("Animals are sleeping");
	}
	
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog say bow-bow");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("Cat say meow meow");
	}
}

public class Hierarchical_inheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sleep();
		d.bark();
		System.out.println("==============================");
		Cat c = new Cat();
		c.sleep();
		c.meow();
	}
}
