class A
{
	A()
	{
		System.out.println("A ()  constructor");
	}
	public void roi()
	{
		System.out.println(" 8 %");
	}
}
class B extends A
{
	//A(){System.out.println("A ()  constructor");} 
	//bcz class name and const name must be same henc not supported 

	B()
	{
		System.out.println("B () constructor ");
	}
	public void roi()
	{
		System.out.println(" 10 %");
	}
}
class Demo3
{
	public static void main(String ars[])
	{
		B b = new B();
		b.roi();		
	}
}
		// OVER RIDING 