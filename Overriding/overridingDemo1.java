package Overriding;

	class Bank
	
	{
		double rateofinterest()
		
		{
			return 0;
		}
	}
	
	class CitiBank extends Bank
	
	{
		double rateofinterest()
		
		{
			return 10.5;
		}
	}

	class BofA extends Bank
	
	{
		double rateofinterest()
		
		{
			return 5.5;
		}
	}
	
	class CapitalOne extends Bank
	
	{
		double rateofinterest()
		
		{
			return 22.5;
		}
	}
public class overridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CitiBank cb = new CitiBank();
		System.out.println(cb.rateofinterest());
		
		BofA ba = new BofA();
		System.out.println(ba.rateofinterest());
		
		CapitalOne co = new CapitalOne();
		System.out.println(co.rateofinterest());
	}

}
