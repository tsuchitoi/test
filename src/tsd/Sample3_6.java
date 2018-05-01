package tsd;

public class Sample3_6 {

	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			System.out.print(x);
		}
		
		System.out.println();
		
		int y = 1;
		for(; y <= 10; y++) {
			System.out.print(y);
		}	
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
//			for構文のひな型
		}
	}

}
