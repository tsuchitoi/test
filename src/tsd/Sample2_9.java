package tsd;

public class Sample2_9 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a == b	:	" 	+ (a == b));
		System.out.println("a != b	:	" 	+ (a != b));
		System.out.println("a > b	:	" 	+ (a > b));
		System.out.println("a >= b	:	" 	+ (a >= b));
		System.out.println("a < b	:	" 	+ (a < b));
		System.out.println("a <= b	:	" 	+ (a <= b));
		
//		同一の判定に「＝＝」が使用できるのは基本データ型のみ
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1 == s2);//NG
		System.out.println(s1.equals(s2));//OK
		
//	　　一見、「＝＝」でも計算できてしまうが、文字列の演算を行う場合は、「equals()」を使う
	}

}
