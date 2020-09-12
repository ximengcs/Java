package calendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {

	public static void main( String[] args ) {
		LocalDate date = LocalDate.now();// 当前日期localdate对象
		int month = date.getMonthValue();// 得到当前月
		int today = date.getDayOfMonth();// 得到当前日
		
		date = date.minusDays( today-1 );// 
		DayOfWeek weekDay = date.getDayOfWeek();
		int value = weekDay.getValue();
		
		System.out.println( "Mon Tue Wed Thu Fri Sat Sun" );
		for( int i = 1; i < value; i++ )
			System.out.print( "    " );
		while( date.getMonthValue() == month ) {
			System.out.printf( "%3d", date.getDayOfMonth() );
			if( date.getDayOfMonth() == today )
				System.out.print( "*" );
			else
				System.out.print( " " );
			date = date.plusDays(1);
			if( date.getDayOfWeek().getValue() == 1 )
				System.out.println(  );
		}
		if( date.getDayOfWeek().getValue() != 1 )
			System.out.println(  );
	}
}
