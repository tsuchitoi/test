package tsd;

public class Sample3_9 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			for(int j = 1; j < 100; j++) {
				int k = i * j;
				if(k < 10) {
					System.out.print("    " + k);
				}else if(k >= 10 && k < 100){
					System.out.print("   " + k);
				}else if(k >= 100 && k <1000) {
					System.out.print("  " + k);
				}else {
					System.out.print(" " + k);
				}
			}
			System.out.println();
		}
	}

}
