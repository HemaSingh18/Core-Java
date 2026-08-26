package in.co.oop.constructors;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	
	public Rectangle(int length,int width, String colour,int boaderWidth) {
		super(colour,boaderWidth);
		this.length=length;
		this.width = width;
		System.out.println("Length :"+this.length);
		System.out.println("Width :"+this.width);
	}

}
