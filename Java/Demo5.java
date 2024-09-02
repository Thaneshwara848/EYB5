abstract class A
{
	A(){}
	void abc(){}
	abstract void xyz();
	abstract void aaa();
}
abstract class B extends A
{
	void xyz()
	{
		System.out.println(" X Y Z  methods ");
	}
	abstract void atoz();
	void aaa(){}
}
class C  extends A
{
	void atoz(){
		System.out.println("A to z methods ");
	}
	
}
class Demo5
{
	public static void main(String ars[])
	{
		//A a = new A();	
		//B b = new B();
		C c = new C();
		c.atoz();
		c.xyz();
		c.aaa();
		// B obj ? no bcz its a absgtract 
		// A obj no bcz its also a Abstytract 
	}
}