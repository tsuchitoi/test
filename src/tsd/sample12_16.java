package tsd;

public class sample12_16 {

	public static void main(String[] args) {
		func(10, 20, 30);
	}
	static void func(long i) {
		System.out.println("(long i)");
	}
	static void func(Integer i) {
		System.out.println("(Integer i)");
	}
	
	//可変長引数（パラメータ）　引数をいくつでも取れる
	static void func(int... i) {
		System.out.println("(int... i)");
		for(int x : i) {
			System.out.println(x);
		}
	}
//	static void func(String...str, int x)コンパイルエラー { 
//	可変長引数は必ず最後に記述し、可変長引数は複数持つことはできない	
//	}

}

