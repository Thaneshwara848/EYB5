class A extends Thread{
	public void run(){
		try{
			for(int i=0;i<=10;i++){
				System.out.println("I  :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e ){}
	}
}
class B extends Thread{
	public void run(){
		try{
			for(int j=0;j<=10;j++)
			{
				System.out.println("	J  :"+j);
				Thread.sleep(1000);
			}
		}
		catch(Exception e ){}
	}
}
class Demo13
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		b.start();
		a.start();
	}
}