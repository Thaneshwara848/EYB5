class Car  extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=30;i++)		
			{
				if(Thread.currentThread().getName().equals("BMW"))
				{
					System.out.println(Thread.currentThread().getName()+" :"+i);
				
				}
				if(Thread.currentThread().getName().equals("Benz"))
				{
					System.out.println("	   "+Thread.currentThread().getName()+" :"+i);
				
				}

				if(Thread.currentThread().getName().equals("Honda"))
				{
					System.out.println("		     "+Thread.currentThread().getName()+" :"+i);
				
				}

				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}
}
class Demo14
{
	public static void main(String args[])
	{
		Car c = new Car();	
		Thread t1= new Thread(c);
		Thread t2= new Thread(c);
		Thread t3= new Thread(c);
		t1.start();	t2.start();	t3.start();
		t1.setName("BMW");	t2.setName("Benz");	t3.setName("Honda");
		for(int i=0;i<=30;i++)
		{
			try
			{
				if(i==10)
				{
					t1.suspend();
				}
				if(i==20)
				{
					t1.resume();
				}
				System.out.println("				I :"+i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}	
	}
}
			