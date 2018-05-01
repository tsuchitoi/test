package tsd;

import java.util.ArrayList;

public class Sample7_3 {

	public static void main(String[] args) {
		int[] x = {0, 1, 2, 3, 4};
		ArrayList<Integer> y = new ArrayList<>();
		y.add(3);
		
		try {
			System.out.println("x[3] : " + x[3]);
			System.out.println(y.get(0));
			System.out.println("x[6] : " + x[6]);
		}catch(ArithmeticException ae) {
			System.out.println("発生した例外 : " + ae);
		}catch(ArrayIndexOutOfBoundsException oe) {
			System.out.println("Array Index Out Of Bounds!!");
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("Inde xOut Of Bounds!");
		}finally {
			System.out.println("Finally block must be execured!");
		}
		System.out.println("x[0] : " + x[0]);
	}

}
