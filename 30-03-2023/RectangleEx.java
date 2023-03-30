class Rect
{
	int length;
	int bredth;
	Rect()
	{
		length=20;
		bredth=30;
	}
	public void area()
	{
		System.out.println("Area of Ractangle :"+(length*bredth));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle :"+(2*length*bredth));
	}
}
public class RectangleEx {

	public static void main(String[] args) {
		Rect r=new Rect();
		r.area();
        r.perimeter();
	}

}
