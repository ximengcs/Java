package question;

import java.util.ArrayList;
import java.util.List;

import question.lib.BerylliumSphere;

public class Q_442_10 {

	//@SuppressWarnings( "unchecked" )
	public static void main( String[] args ) {
		List<ArrayList<String>> ls = new ArrayList<ArrayList<String>>();
		ls.add( new ArrayList<String>() );
		// ! ls.add( new ArrayList<Integer>() );
		
		List<ArrayList<BerylliumSphere>> spheres = new ArrayList<ArrayList<BerylliumSphere>>();
		for( int i = 0; i < spheres.size(); i++ )
			spheres.add( new ArrayList<BerylliumSphere>() );
		
		for( ArrayList<BerylliumSphere> array : spheres )
			System.out.println( array.toString() );
		
		/*List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[])la;
		ls[0] = new ArrayList<String>();
		//! ls[1] = new ArrayList<Integer>();
		
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();*/
		
		/*List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
		for( int i = 0; i < spheres.length; i++ )
			spheres[i] = new ArrayList<BerylliumSphere>();*/
	}
}
