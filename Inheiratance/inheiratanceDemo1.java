package Inheiratance;

	class A //parent class
			//created independant class
	{
		int a;
		
		void display()
		
		{
			System.out.println(a);
		}
	}

	class B extends A//B is child class, A is parent -- going to a to include parent code
	
	{
		int b;
		void print()
		
		{
			System.out.println(b);
		}
	}
	
	
public class inheiratanceDemo1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aobject = new A();
		aobject.a = 100;
		aobject.display();
		
		B bobject = new B();
		bobject.b = 888;
		
		bobject.a = 100;
		
		bobject.display();
		bobject.print();
		
		
	}

}
