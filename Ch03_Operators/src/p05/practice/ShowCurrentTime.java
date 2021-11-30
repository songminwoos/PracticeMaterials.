package p05.practice;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// 1000 ms = 1 second, 1970년 1월 1일 0시 0분 0초 기준
		long totalMiliSeconds = System.currentTimeMillis();
		System.out.println("totalMiliSeconds = " + totalMiliSeconds);
		
		long totalSeconds = totalMiliSeconds / 1000;
		System.out.println("totalSeconds = " + totalSeconds);
		
		long currentSecond = totalSeconds % 60;	
		System.out.println("currentSecond = " + currentSecond);
		
		long totalMinutes = totalSeconds / 60;
		System.out.println("totalMinutes = " + totalMinutes);
		
		long currentMinute = totalMinutes % 60;
		System.out.println("currentMinute = " + currentMinute);
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		System.out.println("현재 시간은 " + currentHour + "시 " + 
								currentMinute + "분 " + currentSecond + "초 입니다.");
	}

}











