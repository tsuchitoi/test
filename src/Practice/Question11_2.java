package Practice;

public class Question11_2 {

	public static void main(String[] args) {
		String a[] = {"5", "23", "a", "89", "c"};

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

	public int[] makeArray1(String[] a) {
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);
			}catch(NumberFormatException e){}
		}
		return b;
	}

	public int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for(int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		}catch(NumberFormatException e){}

		return b;
	}

	public int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for(int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
			return b;
		}catch(NumberFormatException e){
			return new int[a.length];
		}
	}

}

