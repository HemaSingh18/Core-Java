package in.co.oop.constructors;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();
		Shape c1 = new Circle(2, "red", 3);
		System.out.println("-------------------------------------");

		Rectangle r = new Rectangle(2, 3, "green", 5);
		
		System.out.println("---------------------------------------");
		
		Triangle t = new Triangle(2,5,"Yellow",2);
		System.out.println(t.getBase());
		System.out.println("Height :"+t.getHeight());
	}

}
