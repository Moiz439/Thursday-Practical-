class Vehicle
{
	String Brand;
	String Model;
	String Year;
	public void drive()
	{
		Brand="SUZUKI";
		Model="AULTO";
		Year="2015";
	}
}
class Car extends Vehicle
{
	String Color;
	public void type()
	{
		Color="Red";
		System.out.println("Brand :"+Brand+"\nModel :"+Model+"\nYear :"+Year+"\nColor :"+Color);
	}
}
public class VehicleMain {

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		c.type();

	}

}
