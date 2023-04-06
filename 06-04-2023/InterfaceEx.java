package project1;
interface Pqr
{
	public void set();
	public void get();
}
class Xyz implements Pqr
{
	public void set()
	{
		System.out.println("Set Method Called...!");
	}
	public void get()
	{
		System.out.println("Get Method Called...!");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz x=new Xyz();
		x.set();
		x.get();
	}

}
