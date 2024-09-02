final class Car
{
	final int speed=200;
	final void gare()
	{
		System.out.println("5 gares ");
	}	
}
class BMW //extends Car
{
	//void gare(){System.out.println("Auto  gares ");} // final methods cANNOT BE OVERIDEN
}
class Demo10				
{
	public static void main(String args[])
	{
		Car c = new Car();
		System.out.println(c.speed);
		//c.speed=2000;
		//System.out.println(c.speed);
		c.gare();
		BMW b = new BMW();
		//b.gare(); we cant inherit 
	}
}
	final with Var iable = we cant re assign 
	final with methods = we cant overiride 
	final with class  = we cant inherite 
