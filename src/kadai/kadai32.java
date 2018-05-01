package kadai;

import java.util.Scanner;

public class kadai32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("左下直角の二等辺三角形を表示します。");
		System.out.print("段数は : ");
		int n = scn.nextInt();
		scn.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = n; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j >= (n - 1) - i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i <= j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
