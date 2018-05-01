package tsd;

public class Sample3_3 {

	public static void main(String[] args) {
		int x = 70;
		if (x == 100) {
			System.out.println("満点です！");
		}else if(x >= 80) {
			System.out.println("合格です。");
		}else if(x >= 60) {
			System.out.println("頑張りました。");	
		}else {
			System.out.println("もっとがんばりましょう。");
		}
		
		if (x >= 50) {
			System.out.println(x + 5);
		}else {
			System.out.println(x - 5);
		}
	}

}
