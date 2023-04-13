/*
 Write a program to take input of marks of 3 subjects from the user. Check if the total
 of marks given by the user is greater than 50 else throw an exception saying "You Failed". 
Or else print Grade is A if the total is greater than 280. Grade B if the total is greater than 200.
 Grade C if the total is greater than 150. Grade D if the total is greater than 50.
 */
package practicalProgram; // Package declare.

import java.util.Scanner; // import Scanner Class.

public class subjectCalculate { // main Class.

	public static void main(String[] args) { // main method.
		
		int s1,s2,s3,total; // declare the variables.
		Scanner s=new Scanner(System.in); // create an object of Scanner Class here.
		System.out.println("Enter Subject 1 Marks :"); // take subject 1 marks from user.
		s1=s.nextInt(); // store value in s1 variable.
		System.out.println("Enter Subject 2 Marks :"); // take subject 2 marks from user.
		s2=s.nextInt(); // store value in s2 variable.
		System.out.println("Enter Subject 3 Marks :"); // take subject 3 marks from user.
		s3=s.nextInt(); // store value in s3 variable.
		total=(s1+s2+s3); // calculate total marks of 3 subject and store in total variable.
		
		if(total>280) // check total is greater than 280 or not.
		{
			System.out.println("Grade is A.");
		}
		else if(total>200) // check total is greater than 200 or not.
		{
			System.out.println("Grade is B.");
		}
		else if(total>150) // check total is greater than 150 or not.
		{
			System.out.println("Grade is C.");
		}
		else if(total>50) // check total is greater than 50 or not.
		{
			System.out.println("Grade is D.");
		}
		else if(total<50) // check total is less than 500 if it is 50 then throw exception.
		{
			throw new ArithmeticException("You Failed.");     
		}
	}

}
