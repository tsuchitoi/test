package kadai;

import java.util.Random;
import java.util.Scanner;

public class kadai45 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数 : ");
		int a = scn.nextInt();
		scn.close();
		
		String[][] g = new String[10][a];
		int x[] = new int[a];
		 
		//ランダムの数字を要素数分作る
		for(int j = 0; j < a; j++) {
			x[j] = new Random().nextInt(10) + 1;
		}
		
		//表を作ってさっき作ったランダムの数と照らし合わせる。
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < a; j++) {
				if(x[j] >= 10 - i) {
					g[i][j] = "* ";
				}else {
					g[i][j] = "  ";
				}
			}
		}
		
		//上の結果を表示する。
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(g[i][j]);
			}
			System.out.println();
		}
		
		//線を引く
		for(int j = 0; j < a; j++) {
			System.out.print("--");
		}
		System.out.println();
		
		//数字を表示する
//		int cnt = 0;
//		for(int j = 0; j < a / 10 + 1; j++) {
//			for(int i = 0; i < 10; i++) {
//				if(cnt == a) {
//					break;
//				}
//				System.out.print(i + " ");
//				cnt += 1;
//			}
//		}
//		for(int i = 0; i < a; i++) {
//			System.out.print(i % 10 + " ");
//		}
		for(int i = 0; i < a; i++) {
			System.out.print(x[i] % 10 + " ");
			
		}
		System.out.println("ランダムの数 (10は0で表示)");
	}

}
