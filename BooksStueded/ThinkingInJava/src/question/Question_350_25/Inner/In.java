package Question_350_25.Inner;

class In{
	private int i = 98259;
	private void privateMethod(){
		System.out.println( "simon of qq:(private)" + i );
	}
	protected void protectedMethod(){
		System.out.println( "simon of qq:(protected)" + i );
	}
	void packageMethod(){
		System.out.println( "simon of qq:(package)" + i );
	}
}