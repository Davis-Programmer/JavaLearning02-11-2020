package OOPS;

public class constructorParameter {

//begin of class
	int x;
	int y;
	
	constructorParameter(int a, int b)
	
	{
		x = a;
		y = b;
	}
	
	void display()
	
	{
		System.out.println(x + y);
	}
	
//end of class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorParameter cp1 = new constructorParameter(100,200);
		cp1.display();
	}

}
