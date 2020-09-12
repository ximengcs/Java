package question;

import java.io.File;
import java.util.GregorianCalendar;

import lib.net.mindview.util.ProcessFiles;

public class Q_533_6 {

	public static void main( String[] args ) {
		GregorianCalendar current = new GregorianCalendar( 2016, 10, 01 );
		System.out.println( current.getTime() + " 以前的文件" );
		
		new ProcessFiles( 
				new ProcessFiles.Strategy() {
					public void process( File file ) {
						GregorianCalendar time = new GregorianCalendar();
						time.setTimeInMillis( file.lastModified() );
						if( time.getTime().compareTo( current.getTime() ) < 0 )
							System.out.println( file );
							
					}
				}, "java" ).start(args);
		}
}
