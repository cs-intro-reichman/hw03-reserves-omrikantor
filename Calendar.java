/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int counter = 0;
	    int debugDaysCounter = 0;
		while (year < a)
		{
			advance();
		}
	 	while (year == a) 
		{
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);
			if (dayOfWeek == 1) 
			{
				System.out.print(" Sunday");
				System.out.println();
				if (dayOfMonth == 1) 
				{
					counter++;
				}
			}
			else
			{
				System.out.println();
			}	
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (year > a) 
			{ 
	 			break;
	 		}	
        }
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
	    dayOfWeek++;
		dayOfMonth++;
		if(dayOfWeek == 8)
		{
			dayOfWeek = 1;
		}
		if (dayOfMonth == (nDaysInMonth + 1))
		{
			dayOfMonth = 1;
			month++;
			if (month == 13) 
			{
				year++;
				month = 1;
			}
			nDaysInMonth = nDaysInMonth(month, year);
		}
	
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    boolean is = false;
		if((year % 4 == 0) && (year != 1900))
		{
			is = true;
		}
		return is;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
		{
			return 30;
		}
		else
		{
			if(month == 2)
			{
		if (isLeapYear(year))
		{
			return 29;
		}
		else
		{
			return 28;
		}
	        }
			else
			{
				return 31;
			}
	    }
	}
}