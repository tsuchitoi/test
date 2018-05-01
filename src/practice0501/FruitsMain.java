package practice0501;

public class FruitsMain {

	public static void main(String[] args) {
		Fruits f1 = new Fruits("apple", "red", 150);
		Fruits f2 = new Fruits("banana", "yellow", 200);
		System.out.println("名前は" + f1.getName() + "、色は" + f1.getColor() + "、値段は" + f1.getPrice());
		System.out.println("名前は" + f2.getName() + "、色は" + f2.getColor() + "、値段は" + f2.getPrice());

	}

}
class Fruits{
	private String name;
	private String color;
	private int price;
	public Fruits(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
}
