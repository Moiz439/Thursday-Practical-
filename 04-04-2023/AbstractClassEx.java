abstract class Shape  // create Abstract class here.
{
	abstract void calculateArea();  // declare an abstract method calculateArea().
	
}
class Circle extends Shape // create Circle class and extends shape class.
{
	void calculateArea()  // implemets the calculateAreat() method for circle class.
	{
		double area,r;
		r=10;
		area=3.14*r*r;
		System.out.println("Area of Circle :"+area);
	}
}
class Rectangle extends Shape    // create Circle Rectangle  and extends shape class.
{
	void calculateArea()  // implemets the calculateAreat() method for Rectabgle class.
	{
		double area,l,b;
		l=10;b=5;
		area=l*b;
		System.out.println("Area of Circle :"+area);
	}
}

public class AbstractClassEx { //Create a main Class .

	public static void main(String[] args) {  //create a main() method.
		Circle c=new Circle();  // create an object of circle class.
		c.calculateArea();  // calculateArea() method is called for circle class.
		Rectangle r=new Rectangle(); // create an object of Rectangle class.
		r.calculateArea();  // calculateArea() method is called for Rectangle class.
	}

}
