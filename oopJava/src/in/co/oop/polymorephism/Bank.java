package in.co.oop.polymorephism;

public class Bank {
	
	protected double principal;
	protected double rate;
	protected int time;
	protected double rateInterast;

	public String getName() {
		return "RBI";
	}

	public double IntRate() {
		return rateInterast=11.1;
	}

	public static Bank getBank(int i) {
		// method return type
		if (i == 1) {
			return new AxisBank();
		}
		if (i == 2) {
			return new ICICIbank();
		}
		if (i == 3) {
			return new HDFCbank();
		}
		return null;
	}
	
	void calculateInt(int principal, int rate ,int time ) {
		this.principal =principal;
		this.rate =rate;
		this.time =time;
		rateInterast=(principal*rate*time)/100;
		//System.out.println("Intrast Rate = "+(principal*rate*time)/100);
		
	}

}
