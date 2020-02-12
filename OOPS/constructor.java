package OOPS;

public class constructor {
	
	//invoking the value
	
	int sid;
	String sname;
	char grade;
	
	//constructor thumb rule = whenever u use 
	constructor(int id, String name, char g)//writing constructor here because the name of your class
	
	{
	sid = id;
	sname = name;
	grade = g;
	}
	
	void display()
	
	{
	System.out.println(sid + " " + sname + " " + grade);
	}
	
}
