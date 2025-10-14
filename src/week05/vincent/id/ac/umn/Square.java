package week05.vincent.id.ac.umn;

public class Square extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double side;
	
	public Square() {}
	public Square(double side, String color) {
		super(color);
		this.side = side;
	}

	public double getSide() {return side;}
	public double getArea() {return side * side;}
	public double getPerimeter() {return 4 * side;}
}