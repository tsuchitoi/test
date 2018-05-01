package Practice;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) {
		
		Kuraberu k1 = new Kuraberu();
		Scanner scn = new Scanner(System.in);
		System.out.print("aの値 : ");
		int p = scn.nextInt();
		System.out.print("bの値 : ");
		int q = scn.nextInt();
		scn.close();
		
		k1.a = p;
		k1.b = q;
		int resultb = k1.getBigger();
		System.out.println("大きいのは" + resultb);
		
		int results = k1.getSmaller();
		System.out.println("小さいのは" + results);
		
	}
	
	

	
}
class Kuraberu{
	int a;
	int b;
	int getBigger(){
		int big = a;
		if(big < b) {
			big = b;
		}
		return big;
	}
	int getSmaller(){
		int small = a;
		if(small > b) {
			small = b;
		}
		return small;
	}
}	



