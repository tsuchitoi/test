package kadai;

public class kadai28 {

	public static void main(String[] args) {
		int a = 150;
		int b = 180;
		int c = 5;
		
		System.out.println("何cmから : " + a);
		System.out.println("何cmまで : " + b);
		System.out.println("何cmごと : " + c);
		System.out.println("身長　標準体重");
		System.out.println("-----------------");
		
		for(; a <= b; a += c) {
			System.out.print(a + " ");
			System.out.println((a - 100) * 0.9);
		}
	}

}
