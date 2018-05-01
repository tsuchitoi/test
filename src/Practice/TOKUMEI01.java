package Practice;

public class TOKUMEI01 {

	public static void main(String[] args) {
		TOKUMEI01 t = new TOKUMEI01();
		int x = 10;
		t.testMethod(new Int(){
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		});
		Int.method2();
		
		new Int() {
			@Override
			public void method(String s) {
				System.out.println(s);				
			}
		};
	}

	void testMethod(Int i) {
		System.out.println("testMethod");
		i.method("hello");
	}
}

interface Int{
	public void method(String s);
	public static void method2() {
		System.out.println("static method");
	}
	public default void method3() {
		System.out.println("Hello");
	}
}

