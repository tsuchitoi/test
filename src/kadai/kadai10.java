package kadai;

public class kadai10 {

	public static void main(String[] args) {
		
		int a = 55;
		int b = 33;
		int c = 44;
		
		System.out.println("変数a : " + a);
		System.out.println("変数b : " + b);
		System.out.println("変数c : " + c);
		
		System.out.println("a≦ｂ≦cとなるようにソートしました。");
		
		if(a > b) {
			if(a > c) {
				if(b >c) {
					System.out.println("変数aは" + c);
					System.out.println("変数bは" + b);
					System.out.println("変数cは" + a);
				}else {
					System.out.println("変数aは" + b);
					System.out.println("変数bは" + c);
					System.out.println("変数cは" + a);
				}
			}else {
				System.out.println("変数aは" + b);
				System.out.println("変数bは" + a);
				System.out.println("変数cは" + c);
			}
		}else {
			if(c > a)  {
				if(b > c) {
					System.out.println("変数aは" + a);
					System.out.println("変数bは" + c);
					System.out.println("変数cは" + b);
				}else {
					System.out.println("変数aは" + a);
					System.out.println("変数bは" + b);
					System.out.println("変数cは" + c);
				}
			}else {
				System.out.println("変数aは" + c);
				System.out.println("変数bは" + a);
				System.out.println("変数cは" + b);
			}
		}
	}

}
