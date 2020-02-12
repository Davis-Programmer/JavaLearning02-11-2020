package Inheiratance;

	class A1
	
	{
		int a;
		void display()//name of method -- 
		
		{
			System.out.println(a);
		}
		
	
	}
	
	class B1 extends A1
	
	{
		int b;
		void display()
		
		{
			System.out.println(b);
		}
	}
	
	class C extends B
	
	{
		int c;
		void show()
		//provide logic here
		{
			System.out.println(c);
		}
	}
	
public class inheiratanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C cobject = new C();
		cobject.a = 10;//calling the variable from class a
		cobject.b = 77;//calling the variable from class b
		cobject.c = 30;//calling the variable from class c
		
		cobject.display();
		cobject.print();
		cobject.show();
		
		
	}

}
