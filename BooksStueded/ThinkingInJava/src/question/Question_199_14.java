interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destroy();
}
interface Lethal{
	void kill();
}
class DragonZilla implements DangerousMonster{
	public void menace(){}
	public void destroy(){}
}
interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}
class VeryBadVampire implements Vampire{
	public void menace(){}
	public void destroy(){}
	public void kill(){}
	public void drinkBlood(){}
}
public class Question_199_14{
	static DangerousMonster getDangerousMonster(){
		return new DangerousMonster(){
			public void destroy(){
				System.out.println( "DIn.destroy()" );
			}
			public void menace(){
				System.out.println( "DIn.menace()" );
			}
		};
	}
	static Vampire getVampire(){
		return new Vampire(){
			public void destroy(){
				System.out.println( "VIn.destroy()" );
			}
			public void menace(){
				System.out.println( "Vin.menace()" );
			}
			public void kill(){
				System.out.println( "VIn.kill()" );
			}
			public void drinkBlood(){
				System.out.println( "VIn.drinkBlood()" );
			}
		};
	}
	static void u( Monster b ){
		b.menace();
	}
	static void v( DangerousMonster d ){
		d.menace();
		d.destroy();
	}
	static void w( Lethal l ){
		l.kill();
	}
	public static void main( String[] args ){
		DangerousMonster a1 = getDangerousMonster();
		Vampire a2 = getVampire();
		u(a1);
		v(a1);
		w(a2);
	}
}