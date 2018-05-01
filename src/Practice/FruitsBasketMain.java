package Practice;

import java.util.ArrayList;

public class FruitsBasketMain {

	public static void main(String[] args) {
		FruitsBasket fb = new FruitsBasket(2);
		fb.putFruits(new Fruits("リンゴa", "赤", 100));
		fb.putFruits(new Fruits("リンゴb", "赤", 100));
		fb.putFruits(new Fruits("リンゴc", "赤", 100));
		
		
	}
}

class Fruits{
	private String name;
	private String color;
	private int price;

	public Fruits(String n, String c, int p) {
		name = n;
		color = c;
		price = p;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getprice() {
		return price;
	}

}

class FruitsBasket{
	private ArrayList<Fruits> fruitsList = new ArrayList<>();
	private int limit;
//	private Fruits[] x;
//	private static int count = 0;

	FruitsBasket(int limit){
		this.limit = limit;
//		this.x = new Fruits[this.limit];
	}

//	public void setFruits2(Fruits fruits) {
//		this.x[count] = (fruits);
//		count++;
//	}

	public void putFruits(Fruits fruits) {
		if(fruitsList.size() >= limit) {
			System.out.println("---- ERRAR ----");
			return;
		}
		fruitsList.add(fruits);
		System.out.println(fruits.getName() + "が入りました。");
	}

	public Fruits takeFruits(int index) {
		return fruitsList.remove(index);
	}
}
