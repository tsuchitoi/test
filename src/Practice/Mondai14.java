package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class Mondai14 {

	public static void main(String[] args) {
		String[] array = {"abc", "abcdefg", "a", "ab", "cdef"};
//		Integer[] array2 = {100, 200, 10, 30, 50};
//		
//		Arrays.sort(array2, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return (o1 % 3) > (o2 % 3) ? 1 : -1;
//			}
//		});
//		System.out.println(Arrays.toString(array2));
		
		Arrays.sort(array, new ComparatorImpl());
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
			
		});
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, (String o1, String o2) -> o1.length() - o2.length());
		System.out.println(Arrays.toString(array));
	}

}
class ComparatorImpl implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
				return o1.length() - o2.length();
	}
	
}
//class Com2 implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o1 - o2;
//	}
//	
//}
