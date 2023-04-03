class Person // create Person class.
{
	String name;
	int age;
	void speak(String name,int age) //create speak() method.
	{
		this.name=name;
		this.age=age;
		System.out.println("Name :"+name+"\t Age :"+age);
	}
}
class Student extends Person // create Student class and extends Person class.
{
	String gread;
	void study(String name,int age,String gread) // create stydy() method.
	{
        this.name=name;
        this.age=age;
        this.gread=gread;
		System.out.println("\nName :"+name+"\t Age :"+age+"\t Gread :"+gread);
	}
}
public class PersionEx1 { // create main class .

	public static void main(String[] args) {  // create a main() method.
		Student s=new Student(); // create an object of Student class.
		s.speak("ABC", 30); // call spleak() method.
		s.study("Mueez", 20, "A+"); // call study() method.
	}

}
