package Practice;

public class DogCatMain {

	public static void main(String[] args) {
		Dogs d = new Dogs(5);
		Cats c = new Cats(3);


		d.showWalk();
		d.showBite();

		c.showWalk();
		c.showScrabble();

		System.out.println("犬の年齢は" + d.getAge() + "歳で、特徴は" + d.getWalk() + "ことと" + d.getBite() + "ことです。");
		System.out.println("猫の年齢は" + c.getAge() + "歳で、特徴は" + c.getWalk() + "ことと" + c.getScrabble() + "ことです。");
	}

}

class Animal{

	private int age;
	public Animal(int age){//メソッドの引数は変数と一緒にすると、クイックフィックスで分かりやすくなる。
		this.age = age;//引数をそろえた際には、左側にthisをつける
	}
//	public void setAge(int a) {
//		age = a;
//	}

	public int getAge() {
		return age;
	}

	public String getWalk() {
		return "歩く";
	}

	public void showWalk(){
		System.out.println("歩く");
	}
}

class Dogs extends Animal{
	public Dogs(int age) {
		super(age);
	}
	public void showBite() {
		System.out.println("噛みつく");
	}

	public String getBite() {
		return "噛みつく";
	}
}
class Cats extends Animal{
	public Cats(int age) {
		super(age);
	}
	public void showScrabble() {
		System.out.println("ひっかく");
	}

	public String getScrabble() {
		return "ひっかく";
	}
}
