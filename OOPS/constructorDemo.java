package OOPS;

public class constructorDemo {

	//this is default constructor because we are providing value
	//define value here - centric class begin
	int x;
	int y;
	
	constructorDemo()//should be class name
	
	{
		x = 10;
		y = 20;
		
	}
	
	void display()
	
	{
		System.out.println(x + y);
	}
	//end of centric class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorDemo cm1 = new constructorDemo();
		cm1.display();
	}

}
