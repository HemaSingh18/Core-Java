package in.co.oop.overriding;

public class DogC extends Animal{

	private String breed;
	

	public void eat() {
		System.out.println("Dahi Chicken...");
		//eat();
	}
	
	@Override
	public void sound() {
		System.out.println("Bhow Bhow.......");
		super.sound();
	}
}
