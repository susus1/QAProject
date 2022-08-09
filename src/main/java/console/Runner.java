package console;

import java.time.DayOfWeek;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet p1 = Planet.MARS;
		System.out.println(p1.surfaceGravity());
		
		
		DayOfWeek day = DayOfWeek.TUESDAY;
		
		DayOfWeek tomorrow = day.plus(1);
		
		System.out.println(tomorrow);
		
		
		
//		DrinkSize ds = DrinkSize.MEDIUM;
//		System.out.println(ds.pricePer100Ml());
//		System.out.println(ds.multipleDrinkPrice(5));

	}

}
