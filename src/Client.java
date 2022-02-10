import finance.Fee;

public class Client {
	public static void main(String[] args) {
		
		maths.Caculator c = new maths.Caculator();
		System.out.println(c.addNumbers(9, 9));
		
		Fee f = new Fee();
		f.takeFees(7600);
		
	}
}
