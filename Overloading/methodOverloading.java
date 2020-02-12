package Overloading;

public class methodOverloading {
	
	//overloading is in the class
	//method overloading is a feature that allow a class to have more than one method to have the same name
	void minus(int a, int b)
	
	{
		System.out.println(a - b);
	}
	
	void add(int a, double b)
	
	{
		System.out.println(a + b);
	}

	void add(double a, double b)

	{
	System.out.println(a + b);
	}

	void add(int a, int b, int c)

	{
	System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodOverloading mo = new methodOverloading();
		mo.add(10, 20);
		mo.add(10, 20.0);
		mo.add(10.0, 20.0);
		mo.add(10, 20, 3);
		mo.minus(10, 30);
	}

}
