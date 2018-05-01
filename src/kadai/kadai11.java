package kadai;

import java.util.Random;

public class kadai11 {

	public static void main(String[] args) {
		int x = new Random().nextInt(3);
		
		System.out.print("コンピュータが生成した手 : ");
		
		switch(x) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		default:
			System.out.println("パー");
		}
	}

}
