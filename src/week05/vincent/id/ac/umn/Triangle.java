package week05.vincent.id.ac.umn;

public class Triangle extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double base, height;
	
	public Triangle() {}
	public Triangle(double base, double height, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {return base;}
	public double getHeight() {return height;}
	public double getArea() {return 0.5 * base * height;}
	public double getPerimeter() {
		double hypotenuse = Math.sqrt(base * base + height * height);
		return base + height + hypotenuse;
	}
}
