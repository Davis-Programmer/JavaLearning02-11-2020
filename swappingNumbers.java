
public class swappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		int b = 20;
		
		System.out.println("Before swapping");
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		
		a = a + b;//31
		b = a - b;//31 - 20 = 11
		a = a - b;//31 - 11 = 20  
		
		System.out.println("After swapping");
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
	}

}
