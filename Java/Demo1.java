import java.util.*;
interface Company
{
	void cab();
}
//abstract class Emp
 class Emp{
	Scanner sc= new Scanner(System.in);
	int id,age;
	String name;
	Emp()
	{
		System.out.println("ID :");  id= sc.nextInt();
		System.out.println("Name:"); name= sc.next();
		System.out.println("Age :");  age= sc.nextInt();
	}
	//abstract void pf(); 12 from the salary 
	//abstract bonus()  : 50 % of salary 
}									 
											 
class Clerk extends Emp implements Company 
{
	int salary=30000;
	String desig="Clerk";
	Clerk(){}
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Desig :"+desig);
	}
	void raiseSalary()
	{
		System.out.println("ID :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+(salary+5000));
		System.out.println("Desig :"+desig);
	}

}
class Developer  extends Emp 

{
	int salary=50000;
	String desig="Developer";

	Developer(){}
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Desig :"+desig);
	}

}
class Tester extends Emp 

{
	int salary=40000;
	String desig="Tester";
	Tester(){}
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Desig :"+desig);
	}
	void raiseSalary()
	{
		System.out.println("ID :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+(salary+5000));
		System.out.println("Desig :"+desig);
	}


}
class Manager  extends Emp 

{
	int salary=70000;
	String desig="Manager";

	Manager(){}
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Desig :"+desig);
	}

}
class Demo1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int ch1,ch2,ch3=0;
		Manager m=null;
		Developer d = null;
		Tester t = null;
		Clerk c = null;
		do
		{
			System.out.println("1 ) CREAT ");
			System.out.println("2 ) READ ");
			System.out.println("3 ) Raise Salary ");
			System.out.println("4 ) Exit ");
			System.out.println("Enter the Choice ?");
			ch1=sc.nextInt();
			if(ch1==1)
			{
				do
				{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit ");

					System.out.println("Enter the Choice ?");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						m = new Manager();
					}
					if(ch2==2)
					{	
						 d = new Developer();
					}
					if(ch2==3)
					{
						 t = new Tester();
						// incre the exesting salary with some hike
					}
					if(ch1==4)
					{
						 c = new Clerk();
					}
				}while(ch2!=5);	

			}
			if(ch1==2)
			{
				do
				{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit ");

					System.out.println("Enter the Choice ?");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						m.display();
					}
					if(ch2==2)
					{	
						d.display();
					}
					if(ch2==3)
					{
						t.display();
					}
					if(ch1==4)
					{
						c.display();
					}
				}while(ch1!=4);	
			}
			if(ch1==3)
			{
				do
				{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit ");

					System.out.println("Enter the Choice ?");
					ch3=sc.nextInt();
					if(ch3==1)
					{
						t.raiseSalary();
					}
					
				}while(ch1!=4);	
			}
			if(ch1==4)
			{
				System.out.println("Thannk you....!");
			}
		}while(ch1!=4);	
	}
}

