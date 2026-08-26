package in.co.oop.overriding;

public class TestRBI {
	public static void main(String[] args) {
	
	System.out.println("------------HDFC----------------");
	HDFCbank h = new HDFCbank();
	System.out.println("HDFC :"+h.interestRate());
	h.calcInterest(15000, 3);
	
	System.out.println("-------------ICICI-----------------");
	ICICIbank i = new ICICIbank();
	System.out.println("ICICI :"+i.interestRate());
	i.calcInterest(20000, 2);
	i.setRules("Payment on Time Till The Date, Don't delay payment, don't pay extra mony !!");
	System.out.println("Rules :"+i.getRules());
	
	System.out.println("-------------Axis-------------------");
	AxisBank a = new AxisBank();
	System.out.println(""+a.interestRate());
	}
}
