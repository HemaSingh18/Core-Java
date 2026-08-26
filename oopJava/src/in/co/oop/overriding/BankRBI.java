package in.co.oop.overriding;

public class BankRBI {
	
	//protected String Name;
	protected double interestRate;
	
	public double interestRate() {
		System.out.println("Rate of interest in RBI");
		return 11.1;
	}
	public void calcInterest(double principal, int time) {
		double interest =(principal*this.interestRate*time)/100;
		System.out.println("Interest is ="+interest);
		
	}
	
	/**public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getInterestRate() {
		return 11.1;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double calcInterest(double principal, double time) {
		return this.interestRate =(principal*this.interestRate*time)/100;
		
		
	}**/

}
