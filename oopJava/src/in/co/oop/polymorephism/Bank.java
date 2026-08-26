package in.co.oop.polymorephism;

public class Bank {

	public String getName() {
		return "RBI";
	}

	public double IntRate() {
		return 11.1;
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

}
