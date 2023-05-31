package lambdaFunction;

@FunctionalInterface
interface Ax
{
	void display();
}
class Axb implements Ax
{
	public void display()
	{
		System.out.println("Hello Mueez.");
	}
}
public class FunctinalInterfaceEx {

	public static void main(String[] args) {
		

		Axb obj=new Axb();
		obj.display();
	}

}
