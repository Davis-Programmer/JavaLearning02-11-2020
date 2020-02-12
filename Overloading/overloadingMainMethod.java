package Overloading;

public class overloadingMainMethod {
	
	public void main(int x)
	
	{
		System.out.println(x);
	}

	public void main (int x, int y)
	
	{
		System.out.println(x + y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloadingMainMethod omm = new overloadingMainMethod();
		omm.main(100);
		omm.main(100, 200);
	}

}
