package week02.day02.practice01;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// 
		int sum = Integer.parseInt(args[0] + Integer.parseInt(args[1]));
		System.out.println(sum);
		
		long salary1= 91716;
		Long salary2= 917161;
		
		//Boxing is the process of converting a primitive to wrapper class
		int marks=100;
		Integer newsMarks= new Integer(marks));  // boxing
		integer newMarks2= marks;               // auto boxing
		
		Double budget= 19272.87;
		double budget1= Double.valueof(budget);//   unboxing <jdk 1.5
		double budget2= budget;
	}

}
