import java.util.*;// Import the util package.
class EvenOddEx
{
    public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
	    
		System.out.println("Enter Number :");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is Even.");
		}
		else
		{
			System.out.println("Number is Odd.");
		}
	}
}