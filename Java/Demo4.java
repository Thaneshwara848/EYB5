// hiding the implementation by showing only methods name to the end user 
// abstract methods are forc you to over ride in child class 
// is comthng compuslory to execute in all the class the make such methdsk are abstract ....!
abstract class A
{
	abstract void roi();
	abstract void ATM();
	void xyz()
	{
			// abstarct class are no1 100 %  abstract  , where we can achive in interface ....!
	}
}
class B extends A
{
	void roi()
	{
		System.out.println("ROI : 8 %");
	}
	void ATM(){}
}
class C  extends A
{
	void roi()
	{
		System.out.println("ROI : 10 %");
	}
	void ATM(){}
}
class Demo4
{
	public static void main(String ars[])
	{
		//A a = new A(); we cant create aobj of Abstract class 
		B b = new B();
		C c= new C();
		b.roi();	
		c.roi();	
	}
}