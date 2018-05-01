package kadai;

public class kadai07 {

	public static void main(String[] args) {
		int a = 22;
		int b = 12;
		
		System.out.println("整数a : " + a);
		System.out.println("整数b : " + b);
		
		if(a - b >= 11 || b - a >= 11) {
			System.out.println("それらの差は１１以上です。");
		}else {
			System.out.println("それらの差は１０以下です。");
		}

	}

}
