package graphic;

public class Main4 {

	public static void main(String[] args) {
		// 正三角形の確認
				Triangle t1 = new Triangle(10.0, 8.660);
				EquilateralTriangle t2 = new EquilateralTriangle(10.0);
				System.out.println("正三角形の確認");
				System.out.println("Triangle：" + t1.getArea());
				System.out.println("EquilateralTriangle：" + t2.getArea());
				System.out.println();
				
				// 直角三角形の確認
				Triangle t3 = new Triangle(10.0, 10.0);
				RightTriangle t4 = new RightTriangle(10.0, 10.0);
				System.out.println("直角三角形の確認");
				System.out.println("Triangle：" + t3.getArea());
				System.out.println("RightTriangle：" + t4.getArea());
				System.out.println();

				// 二等辺三角形の確認
				Triangle t5 = new Triangle(10.0, 8.660);
				IsoscelesTriangle t6 = new IsoscelesTriangle(10.0, 1.047f);
				System.out.println("二等辺三角形の確認");
				System.out.println("Triangle：" + t5.getArea());
				System.out.println("IsoscelesTriangle：" + t6.getArea());
				System.out.println();

				// 直角二等辺三角形の確認
				RightTriangle t7 = new RightTriangle(10.0, 10.0);
				IsoscelesRightTriangle t8 = new IsoscelesRightTriangle(10.0);
				System.out.println("直角二等辺三角形の確認");
				System.out.println("Triangle：" + t7.getArea());
				System.out.println("IsoscelesRightTriangle：" + t8.getArea());
				System.out.println();

	}

}
class Triangle{
	private double bottom;
	private double height;
	public Triangle(double bottom) {
		this.bottom = bottom;
	}
	public Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	public double getSide() {
		return bottom;
	}
	public double getHeight() {
		return height;
	}
	public double getArea() {
		return bottom * height / 2;
	}
}

class RightTriangle extends Triangle{
	public RightTriangle(double side1, double side2) {
		super(side1, side2);
	}
}

class EquilateralTriangle extends Triangle{
	public  EquilateralTriangle(double side) {
		super(side, (side * Math.sqrt(3) / 2));
	}
}

class IsoscelesTriangle extends Triangle{
	public IsoscelesTriangle(double equalSide, float isoSide) {
		super((double) isoSide, Math.sqrt((equalSide * equalSide) - ((isoSide / 2) * (isoSide / 2))));
	}
}

class IsoscelesRightTriangle extends RightTriangle{
	public IsoscelesRightTriangle(double equalside) {
		super(equalside, equalside);
	}
}

