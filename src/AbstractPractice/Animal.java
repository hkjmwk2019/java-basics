package AbstractPractice;

public abstract class Animal {
	String  pioture;
	String  foode;
	String  hunger;
	Boolean  boundaries;
	String   location;
	
	public abstract void makeNoise();
	public abstract void eat();
	public void sleep() {
		System.out.println("Animal should sleep");
	}
	public abstract void roam();
	
	
}
