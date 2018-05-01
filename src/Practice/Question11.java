package Practice;

public class Question11 {

	public static void main(String[] args) {
		String[] a = {"5", "23", "a", "89", "b", "c"};
		
		int c[] = new Question11().makeArray1(a);
		System.out.print("a : {");
		for(int i = 0; i < c.length; i++) {
			if(i == c.length - 1) {
				System.out.print(c[i]);
			}else {
				System.out.print(c[i]);
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();

		int d[] = new Question11().makeArray2(a);
		System.out.print("a : {");
		for(int i = 0; i < d.length; i++) {
			if(i == d.length - 1) {
				System.out.print(d[i]);
			}else {
				System.out.print(d[i]);
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();

		int f[] = new Question11().makeArray3(a);
		System.out.print("a : {");
		for(int i = 0; i < f.length; i++) {
			if(i == f.length - 1) {
				System.out.print(f[i]);
			}else {
				System.out.print(f[i]);
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}


	public int[] makeArray1(String[] s) {
		int b[] = new int[s.length];
		for(int i = 0; i < s.length; i++) {
			try {
				b[i] = Integer.parseInt(s[i]);
			}catch(NumberFormatException e) {
				System.out.println("a[" + i + "]に0を入力しました。");
			}
		}
		return b;
	}


	public int[] makeArray2(String[] s) {
		int b[] = new int[s.length];
		try {
			for(int i = 0; i < s.length; i++) {
				b[i] = Integer.parseInt(s[i]);
			}
		}catch(NumberFormatException e) {
			System.out.println("不適切な入力があったため、それ以降の要素に０が入力されました。");
		}
		return b;
	}


	public int[] makeArray3(String[] s) {
		int b[] = new int[s.length];
		try {
			for(int i = 0; i < s.length; i++) {
				b[i] = Integer.parseInt(s[i]);
			}
			return b;
		}catch(NumberFormatException e) {
			System.out.println("不適切な入力があったため、すべての要素に０が入力されました。");
//			for(int i = 0; i < s.length; i++) {
//				b[i] = 0;
//			}
			return new int[s.length];
		}
	}

}
