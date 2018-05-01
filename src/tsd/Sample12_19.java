package tsd;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sample12_19 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(12);
		array.add(123);
		array.add(1234);
		array.add(12345);
		
		System.out.println();
		System.out.println("拡張for文を使用");
		for(int num : array) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("Stream APIを使用");
		array.stream()
			.filter(num -> num % 2 == 0)
			.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		System.out.println("----------------------------");
		
		System.out.println("拡張for文＋if文");
		ArrayList<Integer> intArray1 = new ArrayList<>();
		for(int num : array) {
			if(num % 2 == 1) {
				if(num <= 1000) {
					intArray1.add(num);
				}
			}
		}
		System.out.println("intArray1 : " + intArray1);
		
		System.out.println("Stream APIを使用");
		ArrayList<Integer> intArray2 = (ArrayList<Integer>)(array.stream()
																	.filter(num -> num % 2 == 1)
																	.filter(num -> num <= 1000)
																	.collect(Collectors.toList()));
		System.out.println("intArray2 : " + intArray2);
		

	}

}
