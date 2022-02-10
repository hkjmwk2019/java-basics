package week02.day02.practice01;

public class Demo2 {


	public static void main(String[] args) {
		System.out.println("d");


	}

}

class Food { }
class Pizza extends Food{	}

class Burger extends Food{ }

	class Animal {
		int age;
		public Food eat() {
			System.out.println("Animal must eat to survive");
			return null;
		}
		
		public void sleep() {	
			System.out.println("Animal should sleep " );
			}
		public static void doWork() {
			System.out.println("Animal dowork called");
		}
		
	}

class Cat extends Animal{
	@Override
	public Pizza eat() {
		super.eat();
		System.out.println("Cate eats fish");
		return null;
	}
	
	public static void doWork() {
		System.out.println("Cat doWork called");
	}
}

class Dog extends Animal{
	public Pizza eat() {
		System.out.println("Dog eats meat");
		return null;
	}
}



