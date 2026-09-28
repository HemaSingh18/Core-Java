package in.co.rays.java.thread;

public class TestHelloRunnable {

	public static void main(String[] args) {
		HelloRunnable n1 = new HelloRunnable(" Hemant");
		HelloRunnable n2 = new HelloRunnable(" Richa");
		
		
		n1.run();
		n2.run();
	}
}
