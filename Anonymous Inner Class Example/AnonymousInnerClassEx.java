package lambdaFunction;

@FunctionalInterface
interface Abc
{
	void display();
}
public class AnonymousInnerClassEx {

	public static void main(String[] args) {
		
		// Anonymous Inner Class.
		Abc obj=new Abc() {
			public void display()
			{
				System.out.println("Hello Mueez.");
			}
		};
	
		obj.display();
	}

}
