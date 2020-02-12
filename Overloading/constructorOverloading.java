package Overloading;

public class constructorOverloading {

	constructorOverloading(int a, int b)
	
	{
		System.out.println(a + b);
	}
	
	constructorOverloading(int a, double b)
	
	{
		System.out.println(a + b);
	}

	constructorOverloading(double a, int b)

	{
		System.out.println(a + b);
	}

	constructorOverloading(int a, int b, int c)

	{
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorOverloading co = new constructorOverloading(100, 200);
		constructorOverloading co1 = new constructorOverloading(100.0, 200);
		constructorOverloading co2 = new constructorOverloading(100, 200, 300);
		

	}

}
