package bmi1;

public class Main {

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
class Human{
	private String name;
	private double height;
	private double weight;
	private static final double borderHigh = 25.0;
	private static final double borderLow = 18.5;
	public Human(String name, double height, double weight){
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
	public static double getBorderHigh() {
		return borderHigh;
	}
	public static double getBorderLow() {
		return borderLow;
	}
}
class Child{
	private String name;
	private double height;
	private double weight;
	private static final double borderHigh = 18.0;
	private static final double borderLow = 15.0;
	public Child(String name, double height, double weight){
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
	public static double getBorderHigh() {
		return borderHigh;
	}
	public static double getBorderLow() {
		return borderLow;
	}
}
class BMI{
	public static double calc(Human human) {
		return (human.getWeight() / human.getHeight() / human.getHeight());
	}
	public static double calc(Child child) {
		return (child.getWeight() / child.getHeight() / child.getHeight());
	}
	public static String judge(Human human) {
		if(calc(human) > Human.getBorderHigh()) {
			return "あなたは太りすぎです。";
		}else if(calc(human) >= Human.getBorderLow() && calc(human) <= Human.getBorderHigh()) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}
	public static String judge(Child child) {
		if(calc(child) > Child.getBorderHigh()) {
			return "あなたは太りすぎです。";
		}else if(calc(child) >= Child.getBorderLow() && calc(child) <= Child.getBorderHigh()) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}
}

