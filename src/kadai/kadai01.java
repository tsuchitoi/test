package kadai;

import java.util.Scanner;

public class kadai01 {

	public static void main(String[] args) {
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("xを入力 : ");
		int x = scn.nextInt();
		System.out.println("ｙを入力 : ");
//		int y = scn.nextInt();
		scn.close();
		
//		int x = 22;
		
		System.out.println("整数値　：　" + x);
		if (x >= 0) {
			System.out.println("その値は正です。");
		}else {
			System.out.println("その値は負です。");
		}
	}

}
