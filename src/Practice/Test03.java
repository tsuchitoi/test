package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		//ArrayListを配列に変換
		list1.add("a");
		list1.add("b");

		String[] array1 = list1.toArray(new String[] {});

		//配列をArrayListに変換
		String[] array2 = {"c", "d"};
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array2));
	}

}
