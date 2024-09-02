class A
{
	A()
	{
		System.out.println("A ()  constructor");
	}
	A(int a)
	{
		System.out.println("A (int a)  constructor");
	}
	A(int a , String name )
	{
	System.out.println("A (int a , String name )  constructor");
	}
	A(int a , int b)
	{
		System.out.println("Area of Rect : "+(a*b));
	}
	void abc(){}
	void abc(int a){}
	void abc(int a , String name){}
	void abc(int a, int b){}
}
class Demo2
{
	public static void main(String ars[])
	{
		A a =  new A();
		A a1=  new A(100);
		A a2= new A(100,"Thanesh");
		A a3= new A(10,20);		
	}
}
		// OVER LODING 




Abstarction ?
	way
		class
		interface 
		