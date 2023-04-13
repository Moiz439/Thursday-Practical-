/*
 * Write a program to create thread. Where you will take the input from the 
 * user and find if the number is odd or even.
 */
package practicalProgram;  // create a package here.

import java.util.Scanner; // import Scanner Class here.
class Threadp extends Thread // Create Threadp Class that extends Thread Class.
{ 
	int no; // declare variable no.
	Scanner sc=new Scanner(System.in); // create an object of Scanner Class.
	public void run() // override the run method.
	{
		System.out.println("Enter Number :"); // take value from user.
		no=sc.nextInt(); // store value in no variable.
		if(no%2==0) // check the no is even or not .
		{
			System.out.println("Number is Even...!"); // print even.
		}
		else // otherwise print else block.
		{
			System.out.println("Number is Odd...!"); // print odd.
		}
	}
}
public class CheckEvenOddThread { // main Class .

	public static void main(String[] args) { // main Method.
		Threadp t1=new Threadp(); // create an object of Threadp class.
		t1.start(); // call the start() method to call the thread.
	}

}
