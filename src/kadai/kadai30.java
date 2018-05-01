package kadai;

import java.util.Scanner;

public class kadai30 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("１からｎまでの整数値を表示します。");
		System.out.print("整数 : ");
		int n = scn.nextInt();
		scn.close();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "の２乗は" + (i * i));
		}
	}

}
