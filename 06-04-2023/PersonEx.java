/*
 * write a program using constructor.
create a class Person with Id, Name, Designation. Ask the user
what are his inputs and according to that call the constructor
 * */
import java.util.Scanner; // import Scanner Class.
class Person // Create Person Class.
{
	int id; // declare variables
	String name;
	String designation;
	Person(int id,String name,String designation) // create a parameterized constructor with 3 parameters.
	{
		this.id=id;  // assign the id to the current id,
		this.name=name; // assign the name to the current name,
		this.designation=designation; // assign the designation to the current designation,
		System.out.println("Id :"+id+" Name :"+name+" Designation :"+designation); // create a parameterized constructor.
	}
	Person(int id,String name) // create a parameterized constructor with 2 parameters.
	{
		this.id=id;// assign the id to the current id,
		this.name=name;// assign the name to the current name,
		System.out.println("Id :"+id+" Name :"+name);
	}
}
public class PersonEx { //create main Class 

	public static void main(String[] args) {  // create main() method.
		Scanner s=new Scanner(System.in); // create a n object of Scanner Class.
		System.out.println("Enter Id :"); // get id from user.
		int id1=s.nextInt();  // store id value in id1 variable.
		System.out.println("Enter Name :"); // get name from user.
		String name1=s.next(); // store name in name1 variable.
		System.out.println("Enter Designation :"); // get designation from user.
		String des=s.next(); // store designation in des variable.
		Person p=new Person(id1,name1,des); // create an object of Person class.
		Person p1=new Person(01,"Abc");  // crate an another object of Person class.
	}

}
