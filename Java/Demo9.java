interface I 
{
	//I(){}
	//void aaaa(){} no bcz its a 100 % abstraction 
	void abc();
	abstract void xyz();
}
class A implements I
{
	public void abc(){}
	public void xyz(){}
}
class Demo9
{
	public static void main(String args[])
	{
		//I i = new I(); we cant 
	}
}