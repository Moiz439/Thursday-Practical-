class Vehicle  // create Vehicle class.
{
	String Brand;  // declare variables.
	String Model;
	String Year;
	public void drive() // create drive() method. 
	{
		Brand="SUZUKI";  // initialized thevariables.
		Model="AULTO";
		Year="2015";
	}
}
class Car extends Vehicle  //create Car class and Car class extends Vehicle class.
{
	String Color; // declare Color variable.
	public void type() // create type() method.
	{
		Color="Red"; //initializ the Color.
		System.out.println("Brand :"+Brand+"\nModel :"+Model+"\nYear :"+Year+"\nColor :"+Color);
	}
}
public class VehicleMain {  // create VehicleMain class.

	public static void main(String[] args) {  // create mai() method.
		Car c=new Car();  //create a object of Car class.
		c.drive(); // call drive() method.
		c.type();  // call type() method.
 
	}

}
