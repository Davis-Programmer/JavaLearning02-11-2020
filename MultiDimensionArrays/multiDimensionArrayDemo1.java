package MultiDimensionArrays;

public class multiDimensionArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int a [][] = {{100,200},{300,400},{500,600}};
		
		
		
		System.out.println("Number of rows: " + a.length);//find number of rows
		System.out.println("Number of columns: " + a[0].length);//counting the columns from 0 and finding the length
		
		
		//use loop to retrieve the data
		//for(int i = 0; i < a.length; i++)//number of rows 1 2 3 4 5 
		//{
			//(int j = 0; j < a[i].length; j++)//number of columns
			//{
				//System.out.println(a[i][j]);//assign a new variable 100 200 300 400 500
				//System.out.println(a);
				//System.out.println(a[i]);
			//}
			
			//enhanced for loop
			for(int r[]:a)
				
			{
				for(int i:r)
				{
					System.out.println(i);
				}
			}
		}
	}

