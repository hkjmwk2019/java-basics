package inheritance;

public class Manager extends Employee {
	String departmentName;
	//int salary= 18000;
	
	public Manager() {
		// comiler inserts super( );
		System.out.println("Manager default cons called");
	}

	public Manager(String departmentName) {
		super();
		System.out.println("Manager paramenterized cons - 2. called");
		this.departmentName = departmentName;
	}

	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager paramenterized cons - 3. called");
	}
	
	public void displayManagerDetails() {
		//int salary = 25000;
		System.out.println("Manager Id : " + employeeId);
		System.out.println("Manager Name : " + employeeName);
		System.out.println("Department Name : " + departmentName);
		System.out.println("Loal Salry : " + salary);
		System.out.println("Manager Salry : " + this.salary);
		System.out.println("Employ Salry : " + super.salary);
	}
	
	

}
