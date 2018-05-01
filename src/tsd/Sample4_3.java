package tsd;

import java.util.ArrayList;

public class Sample4_3 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(3);
		
		array.add("田中");
		array.add("鈴木");
		array.add("高橋");
		
		System.out.println(array.get(1));
	}

}
