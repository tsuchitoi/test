package practice0501_1;

import java.util.ArrayList;

public class FruitsBasketMain {

	public static void main(String[] args) {
		Fruits apple = new Fruits("apple", "red", 100);
		Fruits banana = new Fruits("banana", "yellow", 100);
		Fruits orange = new Fruits("orange", "orange", 100);
		FruitsBasket b1 = new FruitsBasket(4);
		b1.putFruit(apple);
		b1.putFruit(orange);
		b1.takeFruit(apple);
		b1.putFruit(banana);
		b1.putFruit(orange);
		b1.takeFruit(orange);

		b1.showBascket();
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
	
	public void showFruit(Fruits fruit) {
		System.out.println(fruit);
	}
}

class FruitsBasket{
	private ArrayList<Fruits> bascket = new ArrayList<>();
	private int limit;
	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void putFruit(Fruits fruit) {
		if(bascket.size() >= limit) {
			System.out.println("-----ERROR-----");
			return;
		}
		bascket.add(fruit);
	}
	public void takeFruit(Fruits fruit) {
		bascket.remove(fruit);
	}
	public void showBascket() {
		for(Fruits fruit : bascket) {
			System.out.println(fruit.getName());
		}
	}
}
