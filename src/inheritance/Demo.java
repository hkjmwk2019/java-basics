package inheritance;

class Animal{
	int age;
	public void eat(){ System.out.println("Animal must eat to survive"); }
	public void sleep() {
		System.out.println("Animal should sleep");
	}
}

class Cat extends Animal{
	public void eat() {
		super.eat();
		System.out.println("Cat eats fish");
	}
}

class Dog extends Animal{
	public void eat() {
	//	super.eat();
		System.out.println("Dog eats fish");
	}
}

public class Demo {
	public static void main(String[]  args) {
		Cat  c= new Cat();
		c.eat();
		c.sleep();
		
		Dog d=new Dog();
		d.eat();
		d.sleep();
		
	}
}
