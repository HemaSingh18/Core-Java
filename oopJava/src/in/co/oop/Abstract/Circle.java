package in.co.oop.Abstract;

public class Circle extends Shape {

	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	@Override
	public void area() {
		System.out.println(Math.PI * radius * radius);

	}

}
