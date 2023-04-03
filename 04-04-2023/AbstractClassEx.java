abstract class Shape
{
	abstract void calculateArea();
	
}
class Circle extends Shape
{
	void calculateArea()
	{
		double area,r;
		r=10;
		area=2*3.14*r;
		System.out.println("Area of Circle :"+area);
	}
}
class Rectangle extends Shape
{
	void calculateArea()
	{
		double area,l,b;
		l=10;b=5;
		area=l*b;
		System.out.println("Area of Circle :"+area);
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.calculateArea();
		Rectangle r=new Rectangle();
		r.calculateArea();
	}

}
