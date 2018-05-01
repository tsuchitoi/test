package kadai;

public class kadai27 {

	public static void main(String[] args) {
		
		int n = 7;
		int c = 0;
		
		System.out.println("１からｎまでの和を求めます。");
		System.out.println("ｎの値 : " + n);
		for(int a = 1;a <= n; a++) {
			if(a == 1) {
				System.out.print(a);
				c = c + a; //c += a とも書ける。
			}else {
				System.out.print("+" + a);
				c = c + a;
			}
			
		}
		
		System.out.println("=" + c);
	}
	
	

}
