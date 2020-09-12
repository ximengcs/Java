interface interface1{
	void act1();
}
interface interface2 implements interface1{
	void act2();
}
interface interface3 implements interface1{
	void act3();
}
interface interface4 implements interface2, interface3{
	void act4();
}
