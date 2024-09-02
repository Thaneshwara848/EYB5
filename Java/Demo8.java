class A
{
	static int x=1000;
	static void abc()
	{
		System.out.println("Hi ABC method");
	}
}
class Demo8
{
	public static void main(String args[])
	{
			//Instance memeroy 

		//A a = new A();
		//System.out.println(a.x);
		//a.abc();

		// static memery : no need to create obj , directly we can access using class name 
		System.out.println(A.x);
		A.abc();
				

	}
}