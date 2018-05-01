package kadai;

public class kadai08 {

	public static void main(String[] args) {
		int a = 33;
		int b = 22;
		int c = 11;
		
		System.out.println("整数a : " + a);
		System.out.println("整数b : " + b);
		System.out.println("整数c : " + c);
		
		if (a < b && a < c) {
			System.out.println("最小値は" + a);
		}else if(b < a && b < c) {
			System.out.println("最小値は" + b);
		}else {
			System.out.println("最小値は" + c);
		}
	}

}
