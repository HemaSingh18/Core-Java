package in.co.oop.polymorephism;

public class ICICIbank extends Bank {

	@Override
	public String getName() {

		return "ICICI";
	}

	@Override
	public double IntRate() {
		return 9.5;
	}
}
