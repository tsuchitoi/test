package kadai;

import java.util.Scanner;

public class kadai17 {

	public static void main(String[] args) {
		
//		Scanner scn = new Scanner(System.in);
//		System.out.print("xを入力 : ");
//		int x = scn.nextInt();
//		System.out.println("ｙを入力 : ");
//		int y = scn.nextInt();
//		System.out.println("zを入力 : ");
//		int z = scn.nextInt();
//		scn.close();
		Scanner scn = new Scanner(System.in);
		int x;
		do {
			System.out.print("３桁の正の整数値 : ");
			 x = scn.nextInt();
		}while(x > 999 || x < 100);
		
		System.out.println(x + "と入力しましたね。");
		scn.close();
	}
}
