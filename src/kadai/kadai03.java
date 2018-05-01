package kadai;

public class kadai03 {

	public static void main(String[] args) {
		int x = -10;
		
		System.out.println("整数値　：　" + x);
		
		if(x < 0) {
			System.out.println("正でない値が入力されました。");
		}else if (x % 5 == 0) {
			System.out.println("その値は５で割り切れます。");
		}else {
			System.out.println("その値は５で割り切れません。");
		}

	}

}
