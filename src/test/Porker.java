package test;

import java.util.Random;

public class Porker {

	public static void main(String[] args) {
		int random[] = new int[5];
		for(int a : random) {
			a = new Random().nextInt(52) + 1;
			System.out.println(a);
		}
		int[][] cards = new int[2][52];
		int cnt = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				cards[0][cnt] = i;
				cards[1][cnt] = j + 1;
				cnt++;
			}
		}
		for(int i = 0; i < 52; i++) {
			System.out.println(cards[0][i] + " : " + cards[1][i]);
		}
		
		for(int i = 0; i < 5; i++) {
			int act[][] = {{cards[0][random[i]], cards[1][random[i]]}};
			System.out.println();
		}
		Short s = 3;
		int i = new Short(s);
		
		
	}
	

}

//class PorkerCompare{
//	static int markCount;
//	static int numberCount;
//	public int judgeMark(int[][] jm) {
//		int judge[] = {cards[0][]
//		
//		return 0;
//		
//	}
//}
