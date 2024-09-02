import java.util.*;
class Demo11			{	
	public static void main(String args[]){
		m1();		
	}
	static void m1(){
		m2();
		System.out.println("Hi M1 methods ");
	}
	static void m2(){
		m3();
		System.out.println("Hi M2 methods ");
	}
	static void m3(){
		try
		{
			System.out.println("Hi M3 methods ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A "); int a = sc.nextInt();
			System.out.println("Enter B "); int b = sc.nextInt();
			int c = a / b;
			System.out.println("Result :"+c); 
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hiboss we cant devidee anything b y zero ");
		}
		catch(InputMismatchException ime)
		{
				System.out.println("Hi bro please enter the number onlyyyy...! ");
		
		}
	}
}
	