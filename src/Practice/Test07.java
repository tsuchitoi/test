package Practice;

import java.util.function.Predicate;

public class Test07 {

	public static void main(String[] args) {

////		オーソドックスなやり方
//		Pre1 p1 = new Pre1() ;
//		System.out.println(p1.test(100));

		//匿名クラス
		Predicate<Integer> p2 = new Predicate<Integer>() {
			public boolean test(Integer t) {
				return t == 1;
			}
		};
		System.out.println(p2.test(100));

		//ラムダ式
		Predicate<Integer> p3 = (Integer t) -> {
			return t.equals(100);
		};
		System.out.println(p3.test(100));

//		ラムダ式（省略）
		Predicate<Integer> p4 = (t) -> {
			return t == 1;
		};
		System.out.println(p4.test(100));

//		ラムダ式（さらに省略）
		Predicate<Integer> p5 = t -> t == 1;
		System.out.println(p5.test(100));

		Predicate<String> p6 = new Predicate<String>() {
			public boolean test(String t) {
				return t.isEmpty();
			}
		};System.out.println(p6.test(" "));
	}

}

//class Pre1 implements Predicate<Integer>{
//	@Override
//	public boolean test(Integer t) {
//		return t == 1;
//	}
//}
