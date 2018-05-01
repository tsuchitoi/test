package kadai;

public class kadai29 {

	public static void main(String[] args) {
		int a = 13;
		System.out.println("何個 * を表示しますか : " + a);
		for(int i = 1; i <= a; i++) {
			if(i % 5 == 0) {
				System.out.println("*");
				continue;
			}else {
				System.out.print("*");
			}
		}
	}

}
