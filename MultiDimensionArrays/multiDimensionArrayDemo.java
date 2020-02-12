package MultiDimensionArrays;

public class multiDimensionArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step declare the array
		int[][] a = new int[3][2];//3 rows two columns - a is the name of the array
		
		//step 2 - insert value in the array
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		System.out.println("Number of rows: " + a.length);//find number of rows
		System.out.println("Number of columns: " + a[0].length);//counting the columns from 0 and finding the length
		
		
		//use loop to retrieve the data
		for(int i = 0; i < a.length; i++)//number of rows 1 2 3 4 5 
		{
			for(int j = 0; j < a[i].length; j++)//number of columns
			{
				System.out.println(a[i][j]);//assign a new variable 100 200 300 400 500
				//System.out.println(a);
				//System.out.println(a[i]);
			}
		}
	}

}
