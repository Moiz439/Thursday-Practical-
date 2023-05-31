package lambdaFunction;

@FunctionalInterface
interface A
{
	void display();
	
}

public class LambdaEx {

	public static void main(String[] args) {
		
		
		// Lambda Function.
		A obj= ()-> {
			System.out.println("Hello Moiz.");
		};
		
		obj.display();
	}

}
