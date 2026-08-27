package in.co.oop.polymorephism;

public class HDFCbank extends Bank {

	@Override
	public String getName() {
		
		return "HDFC";
	}
	@Override
	public double IntRate() {
		
		return rateInterast=10.11;
	}
	@Override
	void calculateInt(int principal, int rate, int time) {
		
		super.calculateInt(principal, rate, time);
	}
}
