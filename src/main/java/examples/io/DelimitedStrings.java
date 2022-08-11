package examples.io;

import java.util.Arrays;

public class DelimitedStrings {

	public static void main(String[] args) {
		String commaSeparatedList = "monday,tuesday,wednesday";
		String[] dayArray = commaSeparatedList.split(",");
		System.out.println(Arrays.asList(dayArray));
	}

}
