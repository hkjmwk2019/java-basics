package week02.day02.practice01;

class Customer{
	@override
	protected void finalize() throws Throwable{
		System.out.println("Finalize Called");
	}
}

public class DemoFinalize {

	public static void main(String[] args) {
		//
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		Customer customer3=customer2;
		customer1=null;
		Customer customer4 = new Customer();
		
		System.gc();

	}

}