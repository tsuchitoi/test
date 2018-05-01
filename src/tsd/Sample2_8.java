package tsd;

public class Sample2_8 {

	public static void main(String[] args) {
		int num;
		int x;
		
		
		System.out.println("後置の場合");
		num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		
		System.out.println("前置の場合");
		num = 10;
		System.out.println(++num);
		System.out.println(num);
		x = 5;
		num = 10;
		System.out.println(x += num);
		System.out.println(x);
	}

}
