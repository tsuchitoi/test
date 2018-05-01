package Practice;

public class Test04 {
	public void check(Parent p) {
		if(p instanceof Child) {
			System.out.println("c");
		}else if(p instanceof Parent){
			System.out.println("p");
		}
	}
	public static void main(String[] args) {
//		Parent p = new Child();
		Child c = new Child();
		Parent p = c;
		new Test04().check(p);
	}
}
class Parent{}
class Child extends Parent{}

