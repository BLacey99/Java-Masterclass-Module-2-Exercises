
public class MinsToYearsDaysCalc {

	public static void printYearsAndDays(long minutes) {
		int hour = 60;
		int day = 24;
		int year = 365;
		int years;
		int days;
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			if(minutes % year == 0) {
				years = (int) (((minutes / 60)/24)/365);
				days = 0;
				System.out.println(minutes + " minutes = " + years + " year(s) and " + days + " day(s).");
				
			}
			else {
				days = (int) (((minutes / 60)/24)%365);
				years = (int) (((minutes / 60)/24)/365);
				System.out.println(minutes + " minutes = " + years + " year(s) and " + days + " day(s).");
			}
			
			//System.out.println(minutes + " minutes = " + years + " year(s) and " + days + " day(s).");
		}
		
	}
}
