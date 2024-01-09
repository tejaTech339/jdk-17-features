package features_17.seals;

public sealed abstract class A permits B,C {

	public abstract void m1();
	
}
final class B extends A{

	@Override
	public void m1() {

		System.out.println("B class impl");
	}
	
}
final class C extends A{

	@Override
	public void m1() {

		System.out.println("C class impl");
	}
	
}
class Mian{
	
	public static void main(String[] args) {
		
		C c=new C();
		c.m1();
	}
}
