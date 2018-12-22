package shape;

public class Square extends Shape {
	private int lenofSide = 0;
	public void myShape() {
		System.out.println("Hi. I'm a Square.");
	}
	public Square(int s) {
		lenofSide = s;
	}
	public void setLength(int l) {
		lenofSide = l;
	}
	public int getLength() {
		return lenofSide;
	}
	public int getArea() {
		return lenofSide * lenofSide;
	}

}
