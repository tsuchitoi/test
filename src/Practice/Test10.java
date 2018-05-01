package Practice;

import java.util.function.Predicate;

public class Test10 {

	public static void main(String[] args) {
		a p1 = new a();
		System.out.println(p1.test("1000000"));
		
		Predicate<String> p2 = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(p2.test("aaaaaa"));
		
		Predicate<String> p3 = t -> t.length() >= 10;
		System.out.println(p3.test("101010101010"));
	}

}

class a implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}
	
}
