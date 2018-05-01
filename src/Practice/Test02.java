package Practice;

public class Test02 {//オブジェクト型の型変換　その１,その3

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		Animal2 a = d;
		//一行で書くと...
		Animal2 c = new Dog2();
		
		Animal2 e = new Pag2();//孫クラスもオッケー
//		Cat2 f = new Cat2();
//		a = f;                  //これを実行するとa.cry();がにゃーにゃーにかわる
		
		
		a.cry();//わんわんと表示される
		if(a instanceof Dog2) {//instanceof は a と Dog2 が同じサブクラスのものであるかどうか調べる。
			Dog2 h = (Dog2) a;//事前に暗黙的型変換されたものを戻す→キャスト
		}
	}
	
	private static void method(Animal2 a) {
		System.out.println(a);
	}

}

class Animal2{
	void cry() {
		System.out.println("???");
	}
	
}
class Dog2 extends Animal2{
	@Override
	void cry() {
		System.out.println("わんわん");
	}
}
class Cat2 extends Animal2{
	void cry() {
		System.out.println("にゃーにゃー");
	}
}
class Pag2 extends Dog2{
	
}