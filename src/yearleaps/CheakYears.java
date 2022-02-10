package yearleaps;
import java.util.Scanner;

public class CheakYears {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use case:  Accept 5 number from user (through keyboard) and print the sum 
		int inputyear;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter year :  ");
		
		inputyear = sc.nextInt();
		if (inputyear%4 == 0) {
			System.out.println("The Year of " + inputyear + " is leap year. ");
			}else {
			System.out.println("The Year of " + inputyear + " is not leap year. ");
		}
		
	}

}
