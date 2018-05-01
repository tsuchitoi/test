package tsd;

import java.math.BigDecimal;

public class Sample12_1 {

	public static void main(String[] args) {
		ObjectOne obj1 = new ObjectOne(1, 2);
		ObjectOne obj2 = new ObjectOne(1, 2);
		ObjectTwo obj3 = new ObjectTwo(1, 2);
		ObjectTwo obj4 = new ObjectTwo(1, 2);
		if(obj1.equals(obj2)) {
			System.out.println("obj1 is equal to obj2");
		}else {
			System.out.println("obj1 is not equal to obj2");
		}
		
		if(obj3.equals(obj4)) {
			System.out.println("obj3 is equal to obj4");
		}else {
			System.out.println("obj3 is not equal to obj4");
		}
		
		double a = 1.555555555555555;
		BigDecimal bi = new BigDecimal(String.valueOf(a));
		
		double a1 = bi.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(a1);
	}

}
class ObjectOne{
	private int x;
	private int y;
	public ObjectOne(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
class ObjectTwo{
	private int x;
	private int y;
	public ObjectTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object o) {
		ObjectTwo ot;
		if(o instanceof ObjectTwo) {
			ot = (ObjectTwo) o;
			return ot.x == this.x && ot.y == this.y;
		}
		return false;
	}
}
