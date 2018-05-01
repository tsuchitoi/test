package Practice;

public class Test1 {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.method1(100);
		Test2 t2 = new Test2();
		t2.method1(200);


	}

}

class Test2{
	int x;

	void method1(int a){
		System.out.println("method1 called.");
		method2(a);
	}

	void method2(int b) {
		System.out.println("method2 called.");
		x = b;
	}

	static void staticMethod1() {
		System.out.println("staticMethod1 called.");
		staticMethod2();
		//method1(100);  NG  コンパイルエラー　　staticメソッドからインスタンスメソッドは呼び出せない

		//どうしてもインスタンスメソッドを使いたい場合
		Test2 t = new Test2();
		t.method1(10);

	}

	static void staticMethod2() {
		System.out.println("staticMethod2 called.");
	}
}
