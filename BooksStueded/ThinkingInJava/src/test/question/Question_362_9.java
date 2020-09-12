class GenericMethods{
	public <T, T2, T3> void f( T x, T2 y, boolean z ){
		System.out.println( "T:" + x.getClass().getName() );
		System.out.println( "T2:" + y.getClass().getName() );
		System.out.println( "T3:" + new Boolean(z).getClass().getName() );
	}
	public static void main( String[] args ){
		GenericMethods gm = new GenericMethods();
		gm.f( "", 1, false );
		gm.f( 1, true, false );
		gm.f( 1.0, 1, false );
		gm.f( 1.0F, 1, true );
		gm.f( 'c', new GenericMethods(), true );
		gm.f( gm , 1, true );
	}
}