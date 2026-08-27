package in.co.oop.Abstract;

public class TestBusinessman {

	public static void main(String[] args) {
	
	Richman r = new Businessman();
	r.donation();
	r.earnMony();
	r.party();
	System.out.println("---------------------------------");
	
	HelpToOther h = new Businessman();
	h.helpOther();
	}
	
	
}
