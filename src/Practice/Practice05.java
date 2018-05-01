package Practice;

public class Practice05 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			
//			if(i % 3 == 0) {
//				System.out.println("Fizz");
//			}
//			if(i % 5 == 0) {
//				System.out.println("Buzz");
//			}  ifを分割することで単純にしている
			
			if(i % 15 == 0){
				System.out.print(i);
				System.out.println(" Fizz Buzz");
			}else if(i % 3 == 0) {
				System.out.print(i);
				System.out.println(" Fizz");
			}else if(i % 5 == 0) {
				System.out.print(i);
				System.out.println(" Buzz");
			}else {
				System.out.println(i);
			}
		}
		
		
	}
}

