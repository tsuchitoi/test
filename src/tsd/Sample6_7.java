package tsd;

public class Sample6_7 {

	public static void main(String[] args) {
		System.out.println("--------　引数なしのコンストラクタ　--------");
		ManagerSsp m1 = new ManagerSsp();

		System.out.println();
		System.out.println("--------　引数ありのコンストラクタ　--------");
		ManagerSsp m2 = new ManagerSsp("佐藤");
	}

}

class StaffSsp{
	String name = "名無し";

	public StaffSsp() {
		//super();  が隠れてる。
		System.out.println("スーパークラス　名前 : " + name);
	}
	public StaffSsp(String n){
		name = n;
		System.out.println("スーパークラス 名前 : " + name);
	}
}

class ManagerSsp extends StaffSsp{
	public ManagerSsp(){
		System.out.println("サブクラス 名前 : " + name);
	}
	public ManagerSsp(String n){
		super(n); //これを書かないと デフォルトコンストラクター super()がよばれる。
		System.out.println("サブクラス 名前 : " + name);
	}
}

