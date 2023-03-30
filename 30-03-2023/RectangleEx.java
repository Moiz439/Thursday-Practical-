class Rect
{
	int length;
	int bredth;
	Rect()
	{
		length=20;
		bredth=30;
	}
	public void getData()
	{
		System.out.println("Area of Ractangle :"+(length*bredth));
	}
}
public class RectangleEx {

	public static void main(String[] args) {
		Rect r=new Rect();
		r.getData();

	}

}
