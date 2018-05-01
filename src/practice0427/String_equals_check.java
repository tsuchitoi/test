package practice0427;

public class String_equals_check {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str1;
		String str4 = new String("hello");
		StringBuilder str5 = new StringBuilder("hello");
		
		System.out.println(str1.equals(str5));

	}

}

