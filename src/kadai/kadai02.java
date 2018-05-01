package kadai;

public class kadai02 {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		System.out.println("整数値A　：　" + a);
		System.out.println("整数値B　：　" + b);
		
		if (a % b == 0) {
			System.out.println("BはAの約数です。");
		}else {
			System.out.println("BはAの約数ではありません。");
		}
	}

}
