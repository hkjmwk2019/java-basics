package maths;

import java.util.Scanner;

public class Test {

	/** enter your arguments. 1. click on Run->Run configuration
	 *    2. click on "Arguments" tab
	 *    3. In "Program Aruguments" section, enter your arguments
	 *    4. click "Apply"
	*/
	public static void main(String[] args) {
		System.out.println("Please input eggNum :  "); 
		Scanner sc= new Scanner(System.in);
		int eggNum = sc.nextInt();
		int temp = eggNum/144;
		
		int grossNum = eggNum %144;
		
		System.out.println("We have  " + temp + "gross. " ); 
		
		
		
	//	for(int i=0; i<args.length; i++) {
	//			System.out.println(args[i]);
	//	}	
	}

}
