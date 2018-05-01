package kadai;

import java.util.Scanner;

public class kadai15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数 : ");
		String input = scn.nextLine();
		scn.close();
		try {
			int n = Integer.parseInt(input);
			if(n % 2 == 0) {
				System.out.println("入力された数字は偶数です。");
			}else {
				System.out.println("入力された数字は奇数です。");
			}
		}catch(NumberFormatException e) {
			System.out.println("数字を入力してください。");
		}
	}

}
