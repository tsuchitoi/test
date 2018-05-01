package tsd;

public class Sample2_12 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.append("きつね"));
		System.out.println(sb.insert(0, "きた"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(3, 5));
		System.out.println(sb.replace(1, 2, "ま"));
		System.out.println(sb.substring(0, 2));
		System.out.println(sb.substring(0));

	}

}
