package practice0501;

public class Test01 {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		System.out.printf("文字列 「%s」：「%s」", x, y);
		System.out.println();
		String s = String.format("文字列 「%s」：「%s」", x, y);
		System.out.println(s);
		
		//%s … 文字列
		//%d … 整数（デシメル）　　　%,d ３桁ごとに「,」が入る
		//%f … 小数点　　　%.数字f 数字で提示した少数位まで表示
		//%n … 改行
	}

}
//出力結果
//文字列 「100」：「200」
//文字列 「100」：「200」

