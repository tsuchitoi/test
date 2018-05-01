package tsd;

public class Sample6_8 {

	public static void main(String[] args) {
		System.out.println("-------- コンストラクタ呼び出し --------");
		StaffTs s1 = new StaffTs();
		System.out.println("---- メソッド呼び出し ----");
		s1.methodM1();
		s1.methodM2();
	}

}

class StaffTs{
	public StaffTs() {
		this("佐藤"); //super();をする代わりにthis();でも代用できる。
	}
	StaffTs(String name){
		//super();
		System.out.println("名前 : " + name);
	}
	void methodM1() {
		System.out.println("メソッドM1");
	}
	void methodM2() {
		this.methodM1();//this.を書かなくても大丈夫
		System.out.println("メソッドM2");
	}
}
