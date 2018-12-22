package shape;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of Square:");
		int side = scan.nextInt();
		Square sq1 = new Square(side);
		sq1.myShape();
		System.out.println("Area od square sq1 is " + sq1.getArea());
		System.out.println("Enter length and breadth of Rectangle:");
		int length = scan.nextInt(), breadth = scan.nextInt();
		Rectangle rect1 = new Rectangle(length, breadth);
		rect1.myShape();
		System.out.println("Area of Rectangle rect1 is " + rect1.getArea());
		scan.close();

	}

}
