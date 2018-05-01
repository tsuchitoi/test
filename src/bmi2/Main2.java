package bmi2;

public class Main2 {

	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");
	}

}

abstract class  Ningen{
	private String name;
	private double height;
	private double weight;
	private static double borderHigh;
	private static double borderLow;
	public Ningen(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getBorderHigh() {
		return borderHigh;
	}
	public double getBorderLow() {
		return borderLow;
	}
	public static void setBorderHigh(double borderHigh) {
		Ningen.borderHigh = borderHigh;
	}
	public static void setBorderLow(double borderLow) {
		Ningen.borderLow = borderLow;
	}
}
class Human extends Ningen{
	public Human(String name, double height, double weight){
		super(name, height, weight);
		setBorderHigh(25.0);
		setBorderLow(18.5);

	}//共通部分をNingenにまとめた

}
class Child extends Ningen{

	public Child(String name, double height, double weight){
		super(name, height, weight);
		setBorderHigh(18.0);
		setBorderLow(15.0);

	}
}
class BMI{
	public static double calc(Ningen ningen) {
		return (ningen.getWeight() / ningen.getHeight() / ningen.getHeight());
	}//オーバーロードしたものは消した
	public static String judge(Ningen ningen) {
		if(calc(ningen) > ningen.getBorderHigh()) {
			return "あなたは太りすぎです。";
		}else if(calc(ningen) >= ningen.getBorderLow() && calc(ningen) <= ningen.getBorderHigh()) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}//オーバーロードしたものは消した
}

