package kadai;

import java.util.Scanner;

public class Kadai60 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("1からzまでの和を求めます。");
		System.out.print("zの値 : ");
		int z = scn.nextInt();
		scn.close();
		
		Test60 t1 = new Test60();
		int result = t1.sumup(z);
		System.out.println("1から" + z + "までの和は" + result + "です。");
		
	}

}

class Test60{
	int sumup(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
