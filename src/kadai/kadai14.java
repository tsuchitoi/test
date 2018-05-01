package kadai;

public class kadai14 {

	public static void main(String[] args) {
		int a = 60;
		System.out.println("整数 : " + a);
		
//		if(a % 3 == 0) {
//			System.out.println("入力された値は３の倍数です。");
//		}else if(a % 3 == 1) {
//			System.out.println("入力された値を３で割ると１余ります。");
//		}else {
//			System.out.println("入力された値を３で割ると２余ります。");
//		}
		System.out.print("入力された値");
		int b = a % 3;
		switch(b) {
		case 0:
			System.out.println("は３の倍数です。");
			break;
		case 1:
			System.out.println("を３で割ると余りは１です。");
			break;
		case 2:
			System.out.println("に１を足すと３の倍数になります。");
			break;
		}
	}

}
