package dateDifference;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Date;

/**
 * 
 * @author binalfew
 *
 */
public class DateDifference {

	public static void main(String[] args) {
		
		 // create a LocalDateTime object and pass the birth date 
		LocalDateTime birthday = LocalDateTime.of(1980, 9, 1, 10, 0, 3);
		 
		// get the current time
        LocalDateTime today = LocalDateTime.now();

        LocalDateTime birthFrom = LocalDateTime.from(birthday);
        // get the years difference
        long years =  birthFrom.until(today, ChronoUnit.YEARS);
        birthFrom = birthFrom.plusYears(years);
    // get the month difference
        long months = birthFrom.until(today, ChronoUnit.MONTHS);
        birthFrom = birthFrom.plusMonths(months);
    // get the Days difference
        long days = birthFrom.until(today, ChronoUnit.DAYS);
        birthFrom = birthFrom.plusDays(days);
 
        

        System.out.println("From = " + birthday);
        System.out.println("To   = " + today);
        System.out.printf("The time  difference is\n "+ years +" years \n" +months +" months \n "+ days +" days");
            
    
	}

}
