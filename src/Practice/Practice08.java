package Practice;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice08 {

	public static void main(String[] args) {
		PredicateImpl i1 = new PredicateImpl();
		System.out.println(i1.test("11111111111"));

		Predicate<String> i2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(i2.test("10000"));

		Predicate<String> i3 = t -> t.length() >= 10;
		System.out.println(i3.test("ああああああああああ"));



		ConsumerImpl c1 = new ConsumerImpl();
		c1.accept(100);

		Consumer<Integer> c2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		c2.accept(200);

		Consumer<Integer> c3 = i -> System.out.println(i);
		c3.accept(300);

		SupplierImpl s1 = new SupplierImpl();
		System.out.println(s1.get());

		Supplier<String> s2 = new Supplier<String>() {
			@Override
			public String get() {
				return "Supplier1";
			}
		};
		System.out.println(s2.get());

		Supplier<LocalDate> s3 = () -> LocalDate.now().plusDays(1);
		System.out.println(s3.get());

	}

}

class PredicateImpl implements Predicate<String>{

	@Override
	public boolean test(String t) {

		return t.length() >= 10;
	}

}

class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
			System.out.println(i);
	}

}

class SupplierImpl implements Supplier<LocalDate>{

	@Override
	public LocalDate get() {
				return LocalDate.now();
	}

}
