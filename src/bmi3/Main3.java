package bmi3;

public class Main3 {

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

interface InterFaceHuman{
	public abstract String getName();
	public abstract double getHeight();
	public abstract double getWeight();
	public abstract double getBorderHigh();
	public abstract double getBorderLow();
}
class Human implements InterFaceHuman{
	private String name;
	private double height;
	private double weight;
	private double borderHigh = 25.0;
	private double borderLow = 18.5;
	public Human(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public double getHeight() {
		return height;
	}
	@Override
	public double getWeight() {
		return weight;
	}
	@Override
	public double getBorderHigh() {
		return borderHigh;
	}
	@Override
	public double getBorderLow() {
		return borderLow;
	}
}
class Child implements InterFaceHuman{
	private String name;
	private double height;
	private double weight;
	private double borderHigh = 18.0;
	private double borderLow = 15.0;
	public Child(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public double getHeight() {
		return height;
	}
	@Override
	public double getWeight() {
		return weight;
	}
	@Override
	public double getBorderHigh() {
		return borderHigh;
	}
	@Override
	public double getBorderLow() {
		return borderLow;
	}
}
class BMI{
	public static double calc(InterFaceHuman ifh) {
		return (ifh.getWeight() / ifh.getHeight() / ifh.getHeight());
	}
	public static String judge(InterFaceHuman ifh) {
		if(calc(ifh) > ifh.getBorderHigh()) {
			return "あなたは太りすぎです。";
		}else if(calc(ifh) >= ifh.getBorderLow() && calc(ifh) <= ifh.getBorderHigh()) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}
}


