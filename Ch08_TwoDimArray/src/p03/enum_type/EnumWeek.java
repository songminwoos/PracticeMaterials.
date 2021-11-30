package p03.enum_type;

import java.util.Calendar;

// Week : enum type (참조타입)
// Calendar.DAY_OF_WEEK의 return 값이 1 ~ 7 의 정수값임
// - 1: Sunday, 2: Monday, 3:TuesDay,... 7:Saturday
public class EnumWeek {

	public static void main(String[] args) {
		Week today = null;
		
//		today = 3;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 = " + today);
		
	}

}
