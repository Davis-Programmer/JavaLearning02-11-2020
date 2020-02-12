package ThisInheiratance;

public class thisKeywordDemo {

	//this is a keyword to refer to current object
	
	//keyword this " is reference variable in JAVA that refers to current object
	int a, b;//instance variable
	
	//create the method
	void getValues(int a, int b)
	
	//execution of the function
	{
		 this.a = a;//int a & b is separate -- use when you are running a particular variable
		 this.b = b;
	}
		void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//building code with keyword this
		thisKeywordDemo th = new thisKeywordDemo();
		th.getValues(10, 200);
		th.printValues();
		
	}

}
