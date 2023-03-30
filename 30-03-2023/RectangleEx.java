class Rect  // Create Rect class .
{
	int length; //Declare length variable
	int bredth;  //Declare bredth variable
	Rect()   // create a no-argument constructor .
	{
		length=20; // initialize the variable
		bredth=30;// initialize the variable
	}
	public void area()  // create area method().
	{
		System.out.println("Area of Ractangle :"+(length*bredth));
	}
	public void perimeter() // create perimeter() method.
	{
		System.out.println("Perimeter of Rectangle :"+(2*length*bredth));
	}
}
public class RectangleEx {  // create RectangleEx class.

	public static void main(String[] args) {  // create main() method.
		Rect r=new Rect();  //create a object of Rect class.
		r.area(); // call area() method.
                r.perimeter(); // call perimeter() method.
	}

}
