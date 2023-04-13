/*
 * Create two thread.one thread is finding average of first 50 numbers and 
 * other thread is printing square of number store in array arr={10,15,20,25,30}.
 */
package practicalProgram;  // create package.
class Average extends Thread // create Average Class and extends Thread Class.
{
	float i,total,avg; // declare the variables.
	public void run() // override run method.
	{
		for(int i=1;i<=50;i++) // loop execute 50 times.
		{
			total=total+i; // calculate total of 50 no.
		}
		avg=(total/50); // calculate average.
		System.out.println(avg); // print Average.
	}
}
class ArrayPrint extends Thread // create a Class ArrayPrint and extends Thread Class.
{
	int arr[]={10,15,20,25,30}; // initialize the Array with values.
	public void run() // override the run method.
	{
		for(int i=0;i<arr.length;i++) // loop execute up to array length.
		{
		System.out.println(arr[i]); // print the array elements.
		}
	}
}
public class FindingAverageThread { // create main Class.

	public static void main(String[] args) {  // main method.
		Average a=new Average(); // create an object of Average Class.
		a.start(); // call the start() method to execute the 1st Thread.
		ArrayPrint ap=new ArrayPrint(); // create an object of ArrayPoint Class.
		ap.start(); // call start() method to execute the 2nd Thread.
		
	}

}
