package tsd;

class Trainer{
	String name;
	Trainer(){
		name = "名無し";
	}
	Trainer(String n){
		name = n;
	}
}
public class Sample5_7 {

	public static void main(String[] args) {
		
		Trainer s1 = new Trainer();
		
		Trainer s2 = new Trainer("田中さん");
		
		System.out.println("名前 : " + s1.name);
		System.out.println("名前 : " + s2.name);
	}

}
