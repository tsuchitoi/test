package Practice;

public class Test05 extends Animal1{
	protected void saySomething() {
		System.out.println("Moo!");
	}
	public static void main(String[] args) {
		System.out.println("BBB");
		Animal1[] animals = {new Animal1(), new Test05()};
		for(Animal1 a : animals) {
			a.saySomething();
		}
	}

}
class Animal1{
	void saySomething() {
		System.out.println("AAA");
	}
}
