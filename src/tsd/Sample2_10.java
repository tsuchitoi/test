package tsd;

public class Sample2_10 {

	public static void main(String[] args) {
		String str = "きつね";
		
//		char a = str.charAt(0);
//		System.out.println(a); ↓と一緒の結果を示す
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		System.out.println(str.indexOf("つ"));
		System.out.println("何文字？>>>>" + str.length());
		System.out.println(str.toString());
	}

}
