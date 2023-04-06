package project1;

class Abc
{
	void a()
	{  
		System.out.println("I am method a().");
		int c=10/0; // Unchecked Exception .
	}
	void b()
	{
		System.out.println("I am method b().");
		a();
	}
	void c()
	{
		System.out.println("I am method c().");
		b();
	}
}
public class PropagationExample 
{

	public static void main(String[] args) 
	{
		
		Abc a=new Abc();
		try
		{
			a.c();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
