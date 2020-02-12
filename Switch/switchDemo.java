package Switch;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 2;
		
		switch (day)//switch will cut down on code rather than if else
					//if and else is more of value comparison
					//switch works best for simple comparison
					//write code in minimal lines use switch
		{//begin with bracket
		case 1: System.out.println("Sunday"); break;//break will stop code if condition is true
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("Invalid week number");
		}//end with bracket
	}

}
