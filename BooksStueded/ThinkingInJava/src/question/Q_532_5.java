package question;

import java.io.File;
import java.io.IOException;

import lib.net.mindview.util.Directory;

public class Q_532_5 {

	public interface Strategy {
		void process( File file );
	}
	
	private Strategy strategy;
	private String ext;
	public Q_532_5( Strategy strategy, String ext ) {
		this.strategy = strategy;
		this.ext = ext;
	}
	
	public void start( String[] args ) {
		try {
			if( args.length == 0 )
				processDirectoryTree( new File( "." ) );
			else
				for( String arg : args ) {
					File fileArg = new File(arg);
					if( fileArg.isDirectory() )
						processDirectoryTree(fileArg);
					else {
						if( arg.matches(ext) )
							strategy.process( new File(arg).getCanonicalFile() );
					}
				}
		} catch( IOException e ) {
			throw new RuntimeException(e);
		}
	}
	
	public void processDirectoryTree( File root ) throws IOException {
		for( File file : Directory.walk( root.getAbsolutePath(), ext ) )
			strategy.process( file.getCanonicalFile() );
	}
	
	public static void main( String[] args ) {
		new Q_532_5( new Q_532_5.Strategy() {
				public void process( File file ) {
					System.out.println( file );
				}
			}, ".*\\.java" ).start(args);
	}
}