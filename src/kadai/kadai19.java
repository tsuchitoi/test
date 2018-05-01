package kadai;

import java.util.Scanner;

public class kadai19 {

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
		System.out.print("整数Aを入力 : ");
		int x = scn.nextInt();
		System.out.print("整数Bを入力 : ");
		int y = scn.nextInt();
		scn.close();
		int start;
		int end;
		if(x > y) {
			start = y;
			end = x;
		}else {
			start = x;
			end = y;
		}
		while(start <= end) {
			System.out.print(start + " ");
			start++;
		}
	}

}
