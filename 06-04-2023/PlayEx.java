/*
 * Create an interface called ""Playable"" with a method called ""play"". 
Create two classes called ""Song"" and ""Video"" that implement the Playable interface and 
implement the ""play"" method. Create objects of both the Song and Video classes and call 
their respective ""play"" methods.
 * */
//package mueez; // create Package.
interface Playable  // create interface Playable.
{
	void play(); // create an abstract method play().
}
class Song implements Playable // create an Song class and that class implements Playable class.
{

	@Override
	public void play() {  // implements the play() method in Song class.
		System.out.println("I am play() method in Song Class.");
		
	}
	
}
class Video implements Playable // create an Video class and that class implements Playable class.
{

	@Override
	public void play() { // implements play() method in Video class.
		System.out.println("I am play() method in video Class.");
	}
	
}
public class PlayEx { // create main class.

	public static void main(String[] args) { // create main() method.
		Song s=new Song(); // create an object of Song class.
		Video v=new Video(); // create an object of Video Class.
		s.play();  // call play() method from Song Class.
		v.play();  // call play() method from Video Class.
	}

}
