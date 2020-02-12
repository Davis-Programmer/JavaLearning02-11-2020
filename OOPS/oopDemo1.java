package OOPS;

public class oopDemo1 {//class presents everything

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class --> collection of variable and method
		//Method--> block of code that contain logic
		//Object--> instance of a class
		
		//Create a program with employment details lines 13 - 17 are variables
		//we are building a class
		
		int eid;
		String ename;
		double sal;
		int deptno;
		String job;
		
		void display()
			
			//begin building method
			{
			System.out.println(eid);
			System.out.println(ename);
			System.out.println(sal);
			System.out.println(deptno);
			System.out.println(job);
			}
		
		//develop code for object
		
		public static void main(String[] args) 
		{
			oopDemo1 emp1 = new oopDemo1();
			emp1.eid = 102;
			emp1.ename = "Donald";
			emp1.sal = 2500.000;
			emp1.deptno = 10;
			emp1.job = "CFO";
			emp1.display();
			
			oopDemo1 emp2 = new oopDemo1();
			emp2.eid = 102;
			emp2.ename = "Donald";
			emp2.sal = 2500.000;
			emp2.deptno = 10;
			emp2.job = "CFO";
			emp2.display();
		}
		
	}


