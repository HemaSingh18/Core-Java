package in.co.oop.Abstract;

public class Triangle extends Shape {
	
	private int base;
	private int hight;
	
	public Triangle(int base, int hight) {
		this.base = base;
		this.hight = hight;
	}
	public int getBase() {
		return this.base;
	}
	public int getHight() {
		return this.hight;
	}

	@Override
	public void area() {
		System.out.println("area = "+(this.base * this.hight));
		
	}

	
}
