package Practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Syukujitu01 {

	public static void main(String[] args) {
		String[][] holidays = {
				{ "2018-01-01", "元日" },
				{ "2018-01-08", "成人の日" },
				{ "2018-02-11", "建国記念の日" },
				{ "2018-02-12", "振替休日" },
				{ "2018-03-21", "春分の日" },
				{ "2018-04-29", "昭和の日" },
				{ "2018-04-30", "振替休日" },
				{ "2018-05-03", "憲法記念日" },
				{ "2018-05-04", "みどりの日" },
				{ "2018-05-05", "こどもの日" },
				{ "2018-07-16", "海の日" },
				{ "2018-08-11", "山の日" },
				{ "2018-09-17", "敬老の日" },
				{ "2018-09-23", "秋分の日" },
				{ "2018-09-24", "振替休日" },
				{ "2018-10-08", "体育の日" },
				{ "2018-11-03", "文化の日" },
				{ "2018-11-23", "勤労感謝の日" },
				{ "2018-12-23", "天皇誕生日" },
				{ "2018-12-24", "振替休日" }
		};

		Scanner scn = new Scanner(System.in);
		System.out.print("year = ");
		int year = scn.nextInt();
		System.out.print("month = ");
		int month = scn.nextInt();
		scn.close();
		System.out.println("*** " + year + "年" + month + "月の祝日カレンダー ***");
		LocalDate d1 = LocalDate.of(year, month, 1);
//		LocalDate a = LocalDate.parse(holidays[0][0]);
//		System.out.println(a);
//		LocalDate d2 = LocalDate.of(d1.getYear(), (month + 1), d1.getDayOfMonth());
//		Calendar c = new GregorianCalendar(year, month - 1, 1);
//		int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);



			label1: for(; d1.getMonthValue() == month; d1 = d1.plusDays(1)) {
				for(int i = 0; i < holidays.length; i++) {
					LocalDate a = LocalDate.parse(holidays[i][0]);
					if(d1.isEqual(a)) {
						System.out.println(holidays[i][0] + "  " + holidays[i][1]);
						continue label1;
					}
				}
				System.out.println(d1);
			}

	}

}
