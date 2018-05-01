package test;

import java.util.HashMap;
import java.util.Map;

public class CompareMap {

	public static void main(String[] args) {
		Map<Integer, Integer> m1 = new HashMap<>();
		for(int i = 0; i < 9999999; i++) {
			m1.put(i, i);
		}
		
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < 9999999; i++) {
			m1.get(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("HashMapの処理時間（検索）: " + (end1 - start1));
		
	}

}
