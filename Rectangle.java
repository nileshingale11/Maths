package shape;

public class Rectangle extends Shape {
	private int length, breadth;
	public void myShape() {
		System.out.println("Hi. I'm a Rectangle.");
	}
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	public void setDim(int l, int b) {
		length = l;
		breadth = b;
	}
	public int getArea() {
		return length * breadth;
	}

}
