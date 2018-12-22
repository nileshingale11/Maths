package shape;

public class Rectangle extends Shape {
	private int length, breadth;
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
	public Square convertToSquare(int s) {
		Square sq = new Square(s);
		return sq;
	}

}
