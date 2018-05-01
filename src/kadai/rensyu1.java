package kadai;

import java.util.Scanner;

public class rensyu1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数 : ");
		int x = scn.nextInt();
		
		int[] a = new int[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scn.nextInt();
			
		}
		System.out.print("{");
		for(int i = 0; i < x; i++) {
			if(i == 0) {
				System.out.print(a[i]);
			}else {
				System.out.print(", " + a[i]);
			}
		}
		System.out.println("}");
		scn.close();
		
		
	}

}
