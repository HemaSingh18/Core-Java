package in.co.oop.constructors;

public class Shape {

    protected String colour;
	protected int boaderWidth;
	
	public Shape() {
		
		System.out.println("This is default Constructor..");
	}
	public Shape(String colour,int boaderWidth) {
		this.colour =colour;
		this.boaderWidth= boaderWidth;
		System.out.println("Colour :"+colour);
		System.out.println("boader :"+boaderWidth);
	}
	public String getColour() {
		return this.colour;
	}
	public int getBoaderWidth() {
		return this.getBoaderWidth();
	}
}
