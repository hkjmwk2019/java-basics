package week02.day02.practice01;

// Method overloading

public class Demo1 {
	
	public void add(int num1, int num2) {
		System.out.println("Add two numbers : " + (num1 + num2));
	}
	
	public void add(String num1, int num2) {
		System.out.println("Add one string and one number : " + num1 + num2);
	}
	
	public void add(int num1, String num2) {
		System.out.println("Add one number and a string :  " + num1 + num2);
	}
	
	public void add(String firstName, String lastName) {
		System.out.println("Add two numbers : " + (firstName + lastName));
	}

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.add(10, 20);
		d.add("O", 21);
		d.add("Richard ", "Davis");

	}
               // default
}
