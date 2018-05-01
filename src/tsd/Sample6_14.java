package tsd;

public class Sample6_14 {//オブジェクト参照型の型変換　その2

	public static void main(String[] args) {
		School s1 = new Students();
		s1.setName("山田");
//		s1.getName(); 型変換でスーパークラスに行くとサブクラスのメソッドを参照できなくなる。
	}

}

abstract class School{
	String name;
//	abstract void getName() ;
	void setName(String n) {
		name = n;
	}
}

class Students extends School{
	void getName() {//上の抽象メソッドをコメントアウトすると、これはオーバーライドではなく、通常のメソッドにかわる
		System.out.println("名前 : " + name);
	}
}
//型変換を行いスーパークラスにいったとしてもオーバーライドしたメソッドの場合、
//オーバーライドしたサブクラス側のものが呼び出される。
