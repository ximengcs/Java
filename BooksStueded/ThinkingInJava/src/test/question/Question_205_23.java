interface U{
	void methodOne();
	void methodTwo();
	void methodThree();
}
class A{
	U getU( final int num ){
		return new U(){
			public void methodOne(){
				System.out.println( "One" + num );
			}
			public void methodTwo(){
				System.out.println( "Two" + num );
			}
			public void methodThree(){
				System.out.println( "Three" + num );
			}
		};
	}
}
class B{
	private U[] u;
	private int count = 0;
	private int size;
	B( int size ){
		u = new U[size];
		this.size = size;
	}
	void set( U u ){
		this.u[count] = u;
		if( count < size-1 )
			count++;
	}
	void setNull(){
		this.u[count] = null;
		if( count < size-1 )
			count++;
	}
	void setNull( int num ){
		this.u[num] = null;
	}
	void use(){
		for( int i = 0; i <= count; i++ ){
			System.out.println();
			this.u[i].methodOne();
			this.u[i].methodTwo();
			this.u[i].methodThree();
		}
	}
}
public class Question_205_23{
	public static void main( String[] args ){
		B b = new B(10);
		A[] a = new A[10];
		//填充A
		for( int i = 0; i < 10; i++ ){
			a[i] = new A();
		}
		
		//填充B
		for( int i = 0; i < 10; i++ ){
			b.set( a[i].getU(i) );
		}
		
		//使用B
		b.use();
		
		//移除某些引用
		b.setNull( new java.util.Random().nextInt(9) );
	}
}