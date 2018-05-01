package tsd;

public class Sample8_4 {

	public static void main(String[] args) {
		
	}

}

class AnonymitySuper { 
	private int i = 0;
	public void display() {
		System.out.println("This is MySuper Class");
		System.out.println("i = " + i);
	}
}

class AnonymutyOuter {
	private int size = 5;
	
	public void makeTheInner() {
		String str = "local Variable.";
				final String finalStr = "final variable.";
	}
}
