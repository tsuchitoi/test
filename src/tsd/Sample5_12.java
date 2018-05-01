package tsd;

public class Sample5_12 {

	public static void main(String[] args) {
		WorkAc w1 = new WorkAc();
		
		System.out.println("--- aに3を代入、bに13を代入 ---");
		w1.met(3, 13);
		
		System.out.println("--- bに4を代入 ---");
		//w1.a = 13; はaがpublicのため、コンパイルエラーになる。
		w1.b = 4;
//		System.out.println("a = " + this.a + " b = " + this.b);
//		これもaがpublicのため、コンパイルエラーになる。
		w1.show();
	}

}

class WorkAc{
	private int a;
	int b;
	public void met(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a = " + this.a + " b = " + this.b);
	}
	public void show() {
		System.out.println("a = " + this.a + " b = " + this.b);
	}
}

