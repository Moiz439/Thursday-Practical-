class Greater
{
    public static void main(String args[])
	{
	    int num1=100,num2=200,num3=20;
		if(num1>num2 && num1>num3)
		{
		    System.out.println("Number 1 is Greater.");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Number 2 is Greater.");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("Number 3 is Greater.");
		}
		else
		{
			System.out.println("All are Equal.");
		}
		
	}
}