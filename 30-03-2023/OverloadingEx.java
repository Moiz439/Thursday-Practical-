class Over   // Create Over class here.
{
	public void add(int a,int b) // initialize the add() method with 2 parameters.
	{
		System.out.println("2 Arguments method is called...!");
	}
	public void add(int a,int b,int c) // initialize the add() method with 3 parameters.
	{
		System.out.println("3 Arguments method is called...!");
	}
}
public class OverloadingEx { // create OverloadingEx class here.

	public static void main(String[] args) {  // create main() method.
        Over o1=new Over();  // Create object of Over class.
        o1.add(10,2,30);  // call add() method.
	}

}
