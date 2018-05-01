package Practice;

public class MangaMain {

	public static void main(String[] args) {
		Manga m1 = new Manga("進撃の巨人", 475);
		Novel n1 = new Novel("天空の蜂", 918);
		
		System.out.println("作品名は : " + m1.getName() + "、価格は : " + m1.getPrice());
		m1.showRead();
		m1.showWatch();
		
		System.out.println("作品名は : " + n1.getName() + "、価格は : " + n1.getPrice());
		n1.showRead();
		n1.showImage();
	}

}
class Book{
	private String name;
	private int price;

	public Book(String name, int price){
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void showRead() {
		System.out.println("読む");
	}
}


class Manga extends Book{
	public Manga(String name, int price){
		super(name, price);
	}

	public void showWatch() {
		System.out.println("見る");
	}

}

class Novel extends Book{
	public Novel(String name, int price) {
		super(name, price);
	}

	public void showImage() {
		System.out.println("想像する");
	}
}