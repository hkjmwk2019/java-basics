package week02.day02.practice01;

abstract class Animal{
	int age;
	
	public abstract void eat();
	public void sleep() {
		System.out.println("Animal should sleep");
	}			
}

// concrete class
class Cat2 extends Animal{

	@Override
	public void eat() {
		System.out.println("Cat eats fish");
		
	}
	
}

public class Demo03 {

	public static void main(String[] args) {
		Cat2 c = new Cat2();
		//Animal a= new Animal(); abstract can not create instance
		
		c.eat();

	}

}
