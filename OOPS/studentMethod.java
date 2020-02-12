package OOPS;

public class studentMethod {

	int student_id;
	String student_name;
	char Grade;
	
	void getValues(int id, String name, char g)
	
	{
		student_id = id;
		student_name = name;
		Grade = g;
	}
	
	void display()
	
	{
	System.out.println(student_id + " " + student_name + " " + Grade);
	}
}
