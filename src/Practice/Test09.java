package Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test09 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2018-04-24");
		System.out.println(date1);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d1 = LocalDate.parse("2018/05/23");
		System.out.println(d1);
	}

}
