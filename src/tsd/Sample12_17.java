package tsd;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Sample12_17 {

	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("1111", "ItemA");
		map.put("2222", "ItemB");
		map.put("3333", "ItemC");
		map.put("4444", "ItemD");
		map.put("5555", "ItemE");
		
		String key = "2000";
		
		if(map.containsKey(key)) {
			System.out.printf("%s に対応する商品は %s です%n", key, map.get(key));
			
		}else {
			String lowerKey = map.lowerKey(key);
			String higherKey = map.higherKey(key);
			System.out.printf("%sに最も近い商品%n", key);
			if(lowerKey != null) {
				System.out.printf("lower  : %s(%s)%n", map.get(lowerKey), lowerKey);
			}
			if(higherKey != null) {
				System.out.printf("higher : %s(%s)%n", map.get(higherKey), higherKey);
			}
		}
		NavigableMap<String, String> sub = map.subMap("2000", true, "3500", true);
		
		System.out.printf("2000 - 3500 : %s", sub);

	}

}
