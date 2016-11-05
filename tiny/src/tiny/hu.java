package tiny;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hu {

	// public static void main(String start, String end){
	public static void main(String[] args) {
		String start = "01:30:00";
		String end = "08:35:00";
		try {

			SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

			Date startDt = timeFormatter.parse(start);
			Date endDt = timeFormatter.parse(end);

			int extra = 0;
			int duration = (int) (((endDt.getTime() - startDt.getTime()) / 1000) / 60);
			int durationHrs = duration / 60;
			int remainder = duration - durationHrs * 60;
			int standingCharge = 3;
			if (remainder > 0) {
				extra = 1 * 50;
			}

			int charge = (durationHrs * 50) + standingCharge + extra;

			System.out.println("Start = " + startDt);
			System.out.println("End = " + endDt);
			System.out.println("Duration= " + durationHrs);
			System.out.println("remainder= " + remainder);
			System.out.println("charge= " + charge);

		} catch (Exception e) {
			System.out.println("Shhhhhh = ");
		}
	}

}
