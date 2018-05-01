package tsd;

public class Sample6_4 {

	public static void main(String[] args) {
		StaffOv s1 = new StaffOv();
		System.out.println("-------- スーパークラス --------");
		System.out.println("名前 : " + s1.getName());
		
		System.out.println();
		ManegerOv m1 = new ManegerOv();
		
		System.out.println("-------- サブクラス --------");
		m1.setName("田中");
		System.out.println("名前 : " + m1.getName());
		System.out.println("給与 : " + m1.getSalary());
		
			}

}

class StaffOv{
	private String name = "名無し";
	
	void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
}

class ManegerOv extends StaffOv{
	private int salary = 5000000;
	
	public int getSalary() {
		return salary;
	}
	
	@Override //アノテーション（印付けの意味）
	public String getName() {
		//再起呼び出し（実行）
		return "【マネージャー】" + super.getName();//super をつけないと一番近いものを呼び出してしまう...
	}
}
