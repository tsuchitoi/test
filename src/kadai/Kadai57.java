package kadai;

import java.util.Scanner;

public class Kadai57 {

	public static void main(String[] args) {
		//入力を受け取る
		//signOfめぞっどを実行
		//実行結果の出力
		Test57 c1 = new Test57();
		Scanner scn = new Scanner(System.in);//Scannerのインスタンス化
		System.out.print("整数x : ");
		System.out.println("signOf(x)は" +  c1.signOf(scn.nextInt()) + "です。");
		scn.close();
	}

}

class Test57{
//	signOfメゾッドを作る
//	（sysoutを入れない）
	int signOf(int a) {
		int x;
		if(a == 0) {
			 x = 0;
		}else if(a > 0) {
			 x = 1;
		}else {
			 x = -1;
		}
		return  x;
	}
}
