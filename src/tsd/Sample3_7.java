package tsd;

public class Sample3_7 {

	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;
		while(cnt <= 10) {
			sum += cnt;
			cnt++;
		}
		System.out.println("１から１０までの総和は" + sum + "です。");
		
		for(; cnt <= 10; cnt++) {
			sum += cnt;
		}
		
		System.out.println("１から１０までの総和は" + sum + "です。");
	}

}
