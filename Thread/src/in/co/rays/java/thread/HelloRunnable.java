package in.co.rays.java.thread;

public class HelloRunnable implements Runnable {

	private String name=null;
	
	public HelloRunnable(String n) {
		this.name = n;
	}
	@Override
	public void run() {
		
		for(int i = 1;i<50; i++) {
			System.out.println(i +name);
		}
	}

	
}
