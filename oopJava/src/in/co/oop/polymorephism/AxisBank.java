package in.co.oop.polymorephism;

public class AxisBank extends Bank{

	@Override
	public String getName() {
		
		return "Axis";
	}
	
	@Override
	public double IntRate() {
		return super.IntRate();
	}
}
