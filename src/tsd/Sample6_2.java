package tsd;

public class Sample6_2 {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setDate();
		h1.showDate();
		h1.setDate("高橋");
		h1.showDate();
		h1.setDate("鈴木", 25);
		h1.showDate();
	}

}

class Human{
	private String name = "名無し";
	private int age = 0;
	
	void setDate() {
	}
	void setDate(String n) {
		name = n;
	}
	void setDate(String n, int a) {
		name = n;
		age = a;
	}
	
	void showDate() {
		System.out.println("名前は" + name + "さんです。" + "年齢は" + age + "歳です。");
	}
}
