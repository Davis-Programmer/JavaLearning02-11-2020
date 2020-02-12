package Strings;

public class stringTrimDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = " Bye ";//Global value - never store the value in strings
		// s = " Welcome ";//the last on is the global 
		
		//System.out.println(s);
		//System.out.println("Before trimming string s is: " + s);
		
		String s = "      Welcome      To Java";
		String y = "      Welcome         to       the      trimming            t           ";
		System.out.println("Before trimming string s is: " + s);
		System.out.println("After trimming string s is: " + s.trim());
		System.out.println("Trimming:" + y.trim());
	}

}
