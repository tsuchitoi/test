package tsd;

public class Sample6_17 {

	public static void main(String[] args) {
		String str1 = "こんにちわ";
		String str2 = "こんにちわ";

		System.out.println("str1 == str2");
		if(str1 == str2) {
			System.out.println("等しい");
		}else {
			System.out.println("等しくない");
		}
		
		System.out.println("str1.equals(str2)");
		if(str1.equals(str2)) {
			System.out.println("等しい");
		}else {
			System.out.println("等しくない");
		}
		
		System.out.println();
		
		String obj1 = new String("こんにちわ");
		String obj2 = new String("こんにちわ");
		
		System.out.println("obj1 == obj2");
		if(obj1 == obj2) {
			System.out.println("等しい");
		}else {
			System.out.println("等しくない");
		}
		
		System.out.println("obj1.equals(obj2)");
		if(obj1.equals(obj2)) {
			System.out.println("等しい");
		}else {
			System.out.println("等しくない");
		}
	}

}
