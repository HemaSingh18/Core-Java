package in.co.oop.overriding;

public class ICICIbank extends BankRBI{

	private String rules;

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}
	@Override
	public double interestRate() {
		
		return interestRate =5.8;
	}
}
