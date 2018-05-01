package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class kadai46_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("人数 : ");
		int n = scn.nextInt();
		int sum = 0;
		double ave = 0;
		int max = 0;
		int min = 100;
		
		System.out.println("点数を入力せよ。");
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + "番の点数 : ");
			
			a.add(scn.nextInt());
			
			sum += a.get(i);
			ave = (ave * i + a.get(i)) / (i + 1);
			
			if(max < a.get(i)) {
				max = a.get(i);
			}
			if(min > a.get(i)) {
				min = a.get(i);
			}
		}
		
		System.out.println("合計点は" + sum + "です。");
		System.out.println("平均点は" + ave + "です。");
		System.out.println("最高点は" + max + "です。");
		System.out.println("最低点は" + min + "です。");
		scn.close();
	}

}
