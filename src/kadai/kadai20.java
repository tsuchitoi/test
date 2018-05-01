package kadai;

import java.util.Scanner;

public class kadai20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("正の整数値 : ");
		int x = scn.nextInt();
		scn.close();//これをしないとプログラムが完全にストップしない
		           //(メモリーリーク）
		
		while(x >= 0) {
			System.out.println(x);
			x--;
		}
	}

}
