package examples.enums.exercise;

public class Runner {

	public static void main(String[] args) {

//		DayOfWeek d = DayOfWeek.MONDAY;
//		for (DayOfWeek day : d.values()) {
//			System.out.printf("%d   %s %d days to the weekend%n",day.getNumber(),
//					day.toString(), day.daysToWeekend());
//		}
		
		
		java.time.DayOfWeek d2 = java.time.DayOfWeek.WEDNESDAY;
		
		for (java.time.DayOfWeek dayOfWeek : java.time.DayOfWeek.values()) {
			System.out.printf("%d %s%n",dayOfWeek.getValue(), dayOfWeek);
		}
		
		

	}

}
