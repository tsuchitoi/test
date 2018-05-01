package kadai;

import java.util.Scanner;

public class kadai31 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("段数は : ");
		int n = scn.nextInt();
		scn.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
