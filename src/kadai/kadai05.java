package kadai;

public class kadai05 {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		System.out.println("整数a : " + a);
		System.out.println("整数b : " + b);
		
		if(a == b) {
			System.out.println("aとbは同じ値です。");
		}else if(a > b) {
			System.out.println("大きいほうの値は" + a + "です。");
		}else {System.out.println("大きいほうの値は" + b + "です。");
		}
	}
}
