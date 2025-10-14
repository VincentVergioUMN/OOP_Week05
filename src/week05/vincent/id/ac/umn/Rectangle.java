package week05.vincent.id.ac.umn;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double length, width;
	
	public Rectangle() {}
	public Rectangle(double length, double width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {return length;}
	public double getWidth() {return width;}
	public double getArea() {return length * width;}
	public double getPerimeter() {return 2 * (length + width);}
}
