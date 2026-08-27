package in.co.oop.Abstract;

public class TestTypeCast {
	public static void main(String[] args) {
		
		Shape s = new Rectangle();
       //By typeCasting  
		Rectangle r = (Rectangle) s;
		r.setLength(2);
		r.setBase(4);

		System.out.println("Length = "+r.getLength());
		System.out.println("Base = "+r.getBase());
		r.area();
		
		System.out.println("--------------------------------");
		Shape c = new Circle();
		Circle c1 =(Circle) c;
		c1.setRadius(2);
		System.out.println("Radius = "+c1.getRadius());
		c1.area();
		
		//by Constructor
		System.out.println("---------------------");
		Shape t = new Triangle(4,3);
		t.area();
		
	}
}
