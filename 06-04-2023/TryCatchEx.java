package project1;

public class TryCatchEx {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		try
		{
			c=a/b;
			System.out.println("Result :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("End.");
		}
		
	}

}
