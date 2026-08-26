package in.co.oop.polymorephism;

public class TestBank {
	public static void main(String[] args) {

		Bank h = new HDFCbank();
		System.out.println(h.getName());
		System.out.println(h.IntRate());
		System.out.println("===========================");
		
		Bank i = new ICICIbank();
		System.out.println(i.getName());
		System.out.println(i.IntRate());
		System.out.println("============================");
		
		Bank a = new AxisBank();
		System.out.println(a.getName());
		System.out.println(a.IntRate());

	}

}
