class Person 
{
	String name;
	int age;
	void speak(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name :"+name+"\t Age :"+age);
	}
}
class Student extends Person
{
	String gread;
	void study(String name,int age,String gread)
	{
        this.name=name;
        this.age=age;
        this.gread=gread;
		System.out.println("\nName :"+name+"\t Age :"+age+"\t Gread :"+gread);
	}
}
public class PersionEx1 {

	public static void main(String[] args) {
		Student s=new Student();
		s.speak("ABC", 30);
		s.study("Mueez", 20, "A+");
	}

}
