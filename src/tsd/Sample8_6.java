package tsd;

import java.util.function.Predicate;

public class Sample8_6 {

	public static void main(String[] args) {
		Predicate<String> pre = t -> t.equals("Hello");
		System.out.println(pre.test("Hello"));
		System.out.println(pre.test("1"));
	}

}