package in.co.oop.Abstract;

public class Businessman extends Person implements Richman,HelpToOther{

	@Override
	public void helpOther() {
		System.out.println("Help to Other");
		
	}

	@Override
	public void earnMony() {
		System.out.println("earn mony.....");
		
	}

	@Override
	public void donation() {
	System.out.println("Donation ........");
		
	}

	@Override
	public void party() {
	  System.out.println("party :)");
	}
	

}
