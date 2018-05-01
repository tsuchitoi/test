package kadai;

import java.util.Scanner;

public class kadai44 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("要素数 : ");
		int b =  scn.nextInt();
		int i;
		
		int[] a = new int[b];
		for(i = 0; i < b; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] =  scn.nextInt();
		}
		for(i = 0; i < b; i++) {
			if(i == 0) {
				System.out.print("{" + a[i]);
			}else if(i == b - 1){
				System.out.print(", " + a[i] + "}");
			}else {
				System.out.print(", " + a[i]);
			}
		}
		
		scn.close();
		
		
	}

}
