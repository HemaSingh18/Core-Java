package in.co.rays.java.thread;

public class TestWithoutThread {

	public static void main(String[] args) {
		WithoutThread t1 = new WithoutThread(" abhi");
		WithoutThread t2 = new WithoutThread(" Neha");
		
		t1.run();
	}
}
