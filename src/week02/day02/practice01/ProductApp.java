package week02.day02.practice01;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1= new Product(1,"Lakme",199,99);
		//product1.setProductName("Aroma");
		
		Product product2= new Product(1, "Lakme", 199,99);
		
		System.out.println(product1);  //automatically call toStrig( )
		System.out.println(product2);
		
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		
		
		System.out.println(product1.equals(product2));  //true ??
		System.out.println(product1 == product2);    //false
		
		Product product3=product1;
		
		System.out.println(product1.equals(product3));  //true
		System.out.println(product1 == product3);  //true
		
		System.out.println(product1.hashCode()); 
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());
		

	}

}
