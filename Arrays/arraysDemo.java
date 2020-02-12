package Arrays;

public class arraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a collection of elements of same datatype
		
		//single dimensional array - 
		
		//!) Declare an array
		//2) Insert value into array
		//3) find size of array
		//4) read values from an array
		
		int a[] = new int [5]; // declare arrays with size 5 - starting index is 0, the last index is 4 - for int you will have five values
		
		//insert values into the array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		//find size of array
		System.out.println("Length of the array is: " + a.length);//print length/size of an array
		
		//read the value of array
		//System.out.println(a[2]);
		
		for(int i = 0; i <= a.length -1; i++ )
		{
			System.out.println(a[i]);
		}
		
		//two/multi dimensional array
		//like a table work with crows and columns - identify what is the value in the columns and rows
		//
		//int a = 1;
		
	}

}
