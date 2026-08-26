package in.co.oop.constructors;

public class Triangle extends Shape{
 private int base;
 private int height;
 
 public Triangle(int base, int height, String colour,int boaderWidth) {
	 super(colour,boaderWidth);
	 this.base =base;
	 this.height=height;
	// System.out.println("base :"+base);
	// System.out.println("height :"+height);
 }
 public int getBase() {
	 return this.base; 
 }
 public int getHeight() {
	 return this.height;
 }
}
