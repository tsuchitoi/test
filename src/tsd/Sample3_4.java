package tsd;

public class Sample3_4 {

	public static void main(String[] args) {
		int age = 15;
		
		System.out.println("１８歳以上ですか？");
//		String str = age < 18 ? "１８歳未満です。" : "１８歳以上です。";
//		System.out.println(str);
		
		String str;
		if(age < 18) {
			str = "１８歳未満です";
		}else {
			str = "１８歳以上です";
		}
		System.out.println(str);
	}

}
