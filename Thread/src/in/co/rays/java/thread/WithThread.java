package in.co.rays.java.thread;

public class WithThread extends Thread{

	private String name =null;
	
	public WithThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i =1; i<50; i++) {
			System.out.println(i+ name);
		}
	}
}
