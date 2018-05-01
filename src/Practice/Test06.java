package Practice;

public class Test06 {
	private short s;
	private Integer i;
	public Test06(int i) {
		this.i = this.i + i + s;
		this.s = 1;
	}
	public void print() {
		System.out.println("s = " + s + " : + i = " + i);
	}
	public static void main(String[] args) {
		Test06 t = new Test06(2);
		t.print();
//		int [][] iAry = {{0,1,2,3},{4,5},{6,7,8}};
//		System.out.println(iAry[3][0]);
//		System.out.println(iAry[1][2]);
	}

}
