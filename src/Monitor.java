
public class Monitor {

	int num;
	//num= 900;  // will have error, whould be int num =900; or just int num;
	
	{
		System.out.println("3. Initializer Block Called ");
	}
	
	static {
		System.out.println("1. Static Initializer Called ");
	}
	
	public Monitor() {
		System.out.println("4. Monitor Constructor Called ");
	}
	
	public void display() {
		System.out.println("5. Display Called and the value of num is: " + num);
	}
	
	public static void main(String[] args) {
		System.out.println("2. Main( ) Called ");
		
		Monitor m = new Monitor();
		m.display();
		Monitor m2 = new Monitor();
	}

}
