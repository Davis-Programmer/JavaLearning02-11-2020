package Strings;

public class stringComparingEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome";
		
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("wel come"));
		System.out.println(s.equals("wel co me"));
		
		System.out.println(s.equalsIgnoreCase("Welcome"));//Ignore the case sensitive
	}

}
