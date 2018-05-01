package tsd;

public class Sample6_11 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.getComment();
		System.out.println(c1.getSum());
	}

}

interface MyInterFace{
	public static final int A = 10;
	public abstract void getComment();
}

interface SubInterFace extends MyInterFace{
	int getSum();
}

class C implements SubInterFace{
	@Override
	public void getComment() {
		System.out.println("スーパーインターフェイスを実装する。");
	}
	@Override
	public int getSum() {
		return (A + 5);
	}
}