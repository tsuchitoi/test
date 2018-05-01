package test;

import java.util.Map;
import java.util.TreeMap;

public class CompareMap1 {

	public static void main(String[] args) {
		Map<Integer, Integer> m2 = new TreeMap<>();
		for(int i = 0; i < 9999999; i++) {
			m2.put(i, i);
		}
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 9999999; i++) {
			m2.get(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("TreeMapの処理時間（検索）: " + (end2 - start2));

	}

}
