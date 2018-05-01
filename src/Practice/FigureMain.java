package Practice;

public class FigureMain {

	public static void main(String[] args) {
		Circle c1[] = {new Circle(10),
					   new Circle(20),
				       new Circle(30)};

	for(int i = 0; i < c1.length; i++) {
		System.out.println("c1[" + i + "]の面積は : " + c1[i].getArea());
	}
	Square s1[] = {new Square(10),
				   new Square(20)};

	for(int j = 0; j < s1.length; j++) {
		System.out.println("s1[" + j + "]の面積は : " + s1[j].getArea());
	}

//	Cylinder cy1[] = {new Cylinder(5, 10),
//			          new Cylinder(10, 10)};
//
//	for(int k = 0; k < cy1.length; k++) {
//		System.out.println(cy1[k].getVolume());
//	}
	Corn c2 = new Corn(new Square(10), 20);
	Corn c3 = new Corn(new Triangle(10), 20);
	
	System.out.println(c2.getCornS());
	System.out.println(c3.getCornT());
	}




}
class Circle{
	private double radius;
	public Circle(double r){
		radius = r;
	}
	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {

		double area = radius * radius * 3.14;
		return area;
	}
}

class Square{
	private int sides;
	Square(int s){
		sides = s;
	}

	public void setSides(int s) {
		sides = s;
	}

	public int getSides() {
		return sides;
	}

	public int getArea() {
		int area = sides * sides;
		return area;
	}
}

class Triangle{
	private int side;
	Triangle(int side){
		this.side = side;
	}
	public double getArea() {
		return (1 + Math.sqrt(3)) * side;
	}
}

class Cylinder{
//	private int high;
//	private double radius;
//
//	public Cylinder(int h, double r) {
//		high = h;
//		radius = r;
//	}
//	public void setRadius(double r) {
//		radius = r;
//	}
//
//	public void setHigh(int h) {
//		high = h;
//	}
//
//	public int getHigh() {
//		return high;
//	}
//
//	public double getVolume(){
//		double volume;
//		Circle c2 = new Circle(radius);
//		volume = c2.getArea() * high;
//		return volume;
//	}
	private int height;
	private Circle circle;

	public Cylinder(int h, Circle c) {
		height = h;
		circle = c;
	}
	public void setCircle(Circle c) {
		circle = c;
	}
	public double getVolume() {
		return circle.getArea() * height;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(3.0);
		Cylinder c = new Cylinder(5, circle);
		System.out.println(c.getVolume());
	}
}

class Corn{
	private Square square;
	private int height;
	private Triangle triangle;


	public Corn(Square square, int height){
		this.square = square;
		this.height = height;
	}
	public Corn(Triangle triangle, int height){
		this.triangle = triangle;
		this.height = height;
	}

	public int getCornS() {
		return square.getArea() * height / 3;
	}
	public double getCornT() {
		return triangle.getArea() * height / 3;
	}
}
