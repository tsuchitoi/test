package kadai;

import java.util.Scanner;

public class Kadai58 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a : ");
		int x = scn.nextInt();
		System.out.print("整数b : ");
		int y = scn.nextInt();
		System.out.print("整数c : ");
		int z = scn.nextInt();
		scn.close();
		Test58 t1 = new Test58();
		int min = t1.min(x, y, z);
		System.out.println("最小値は" + min + "です。");
	}

}

class Test58{
	int min(int a, int b, int c) {
		if(a > b) {
			a = b;
		}
		if(a > c) {
			a = c;
		}
		return a;
	}
}
