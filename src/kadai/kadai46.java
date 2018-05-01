package kadai;

import java.util.Scanner;

public class kadai46 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("人数 : ");
		int n = scn.nextInt();
		
		System.out.println("点数を入力せよ。");
		
		int[] a = new int[n];
		int sum = 0;
//		double sum = 0;
		double ave = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + "番の点数 : ");
			a[i] = scn.nextInt();
			sum += a[i];
			ave = (ave * i + a[i]) / (i + 1); 
//			ave = sum / (i + 1);
			if(max < a[i]) {
				max = a[i];
			}
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("合計点は" + sum + "です。");
		System.out.println("平均点は" + ave + "です。");
		System.out.println("最高点は" + max + "です。");
		System.out.println("最低点は" + min + "です。");
		scn.close();
		
	}

}
