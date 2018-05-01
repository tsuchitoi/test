package kadai;

public class kadai09 {

	public static void main(String[] args) {
		int a = 22;
		int b = 22;
		
		System.out.println("整数a : " + a);
		System.out.println("整数b : " + b);
		
		if(a == b) {
			System.out.println("二つは同じ値です。");
		}else if(a > b){
			System.out.println("小さいほうの値は" + b);
			System.out.println("大きいほうの値は" + a);
		}else {
			System.out.println("小さいほうの値は" + a);
			System.out.println("大きいほうの値は" + b);
		}
	}

}
