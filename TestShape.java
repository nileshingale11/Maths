//Assignment 3
//Q 3

import java.util.*;

abstract class Shape{
	abstract double calcArea();
	abstract double calcVolume();
}

class Sphere extends Shape{
	double radius;
	final static double PI = 3.14159;
	Sphere(double rad) {
		radius = rad;
	}
	public double calcArea() {
		return 4 * PI * radius * radius;
	}
	public double calcVolume() {
		return (4.0 / 3.0) * PI * radius * radius * radius;
	}
}

class Cone extends Shape{
	double radius, height;
	final static double PI = 3.14159;
	Cone(double rad, double hgt) {
		radius = rad;
		height = hgt;
	}
	public double calcArea() {
		return PI * radius * (Math.sqrt(radius * radius + height * height) + radius);
	}
	public double calcVolume() {
		return 1.0 / 3.0 * PI * radius * radius * height;
	}
}

class Cylinder extends Shape{
	double radius, height;
	final static double PI = 3.14159;
	Cylinder(double rad, double hgt) {
		radius = rad;
		height = hgt;
	}
	public double calcArea() {
		return 2.0 * PI * radius * (radius + height);
	}
	public double calcVolume() {
		return PI * radius * radius * height;
	}
}

class Box extends Shape{
	double length, breadth, height;
	Box(double len, double bdth, double hgt) {
		length = len;
		breadth = bdth;
		height = hgt;
	}
	public double calcArea() {
		return 2.0 * (length * breadth + breadth * height + height * length);
	}
	public double calcVolume() {
		return length * breadth * height;
	}
}

public class TestShape{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which shape you want to evaluate? {Sphere, Cone, Cylinder, Box}\nNote: case sensitive input should be given.");
		String shape = new String(sc.next());
		switch(shape) {
			case "Sphere":
				System.out.println("Enter radius of Sphere:");
				Shape sphere = new Sphere(sc.nextDouble());
				System.out.println("The total surface area of Sphere = " + sphere.calcArea());
				System.out.println("The Volume of Sphere = " + sphere.calcVolume());
				break;
			case "Cone":
				System.out.println("Enter radius and height(not slant) of Cone:");
				Shape cone = new Cone(sc.nextDouble(), sc.nextDouble());
				System.out.println("The total surface area of Cone = " + cone.calcArea());
				System.out.println("The Volume of Cone = " + cone.calcVolume());
				break;
			case "Cylinder":
				System.out.println("Enter radius and height of Cylinder:");
				Shape cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
				System.out.println("The total surface area of Cylinder = " + cylinder.calcArea());
				System.out.println("The Volume of Cylinder = " + cylinder.calcVolume());
				break;
			case "Box":
				System.out.println("Enter length, breadth and height of Box:");
				Shape box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				System.out.println("The total surface area of Box = " + box.calcArea());
				System.out.println("The Volume of Box = " + box.calcVolume());
				break;
			default:
				System.out.println("Invalid shape selected.");
				break;
		}
	}
}
