package in.co.oop.constructors;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle() {
		
		System.out.println("defoult Circle.....");
	}
	public Circle(int radius, String colour,int boaderWidth) {
		
		super(colour,boaderWidth);
	    this.radius =radius;
		System.out.println("Radius :"+this.radius);
		//System.out.println("Colour :"+colour);
		//System.out.println("Boader Width :"+boaderWidth);
	}
	
	public int getRadius() {
		return this.radius;
	}


}
