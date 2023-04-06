package project1;
class Over
{
	public void add(int a,int b)
	{
		System.out.println("2 Arguments method is called...!");
	}
	public void add(int a,int b,int c)
	{
		System.out.println("3 Arguments method is called...!");
	}
}
public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Over o1=new Over();
        o1.add(10,2,30);
	}

}
