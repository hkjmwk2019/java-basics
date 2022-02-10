package inheritance;

public class App {
	public static void main() {
		Manager m= new Manager(109, "David");
		m.departmentName = "HR";
		
		m.displayManagerDetails();
	}
}
