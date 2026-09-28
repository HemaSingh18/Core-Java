package in.co.rays.java.thread;

public class TestWithThread {

	public static void main(String[] args) {
		WithThread w = new WithThread(" name");
		WithThread w1 = new WithThread(" Hema ");
		
		w.start();
		w1.start();
		
		for(int i = 0; i<=5; i++) {
			System.out.println("main");
		}
	}
}
