package in.co.oop.Abstract;

public class Rectangle extends Shape {

	private int length;
	private int base;
	

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	@Override
	public void area() {
		System.out.println("area = " + (length * base));

	}

}
