package practicalProgram; // Create a Package.

import java.util.ArrayList; // import ArrayList.
import java.util.Iterator; // import Iterator.

public class PracticalEx { // create main Class.

	public static void main(String[] args) { // create main() method.
		ArrayList<String> al=new ArrayList<String>(); //create an object of ArrayList.
		
		al.add("Hero"); // add() method is used to add element.
		al.add("Honda");// add() method is used to add element.
		al.add("Shine");// add() method is used to add element.
		al.add("Yuniconen");// add() method is used to add element.
		al.add("Suzuki");// add() method is used to add element.
		al.add("Splender");// add() method is used to add element.
		al.add("HF-Delex");// add() method is used to add element.
		al.add("CD-Delex");// add() method is used to add element.
		al.add("Yamaha");// add() method is used to add element.
		al.add("KTM");// add() method is used to add element.
		
		al.add(0, "Start");// add(index,object) method is used to add element at start.
	    al.add("End");// add() method is used to add element and the end of Arraylist().
	    
		System.out.println(al); // print ArrayList
		Iterator it=al.iterator(); // create an object of Iterator Class.
		while(it.hasNext()) // call hasNext() method.
		{
			String s=(String)it.next(); // call next() method.
			System.out.println("\n"+s+"\n"); // print ArrayList in Iterator form.
		}
		 System.out.println(al); // print ArrayList.
		 
		System.out.println("\n"+al.get(4)); // print the element the index is 4.
		
	    al.set(7, "XUV300"); // update the arraylist element by using set(index,object) method.
	    
	   
	    
	    if(al.contains("verna")) // search the element in the arraylist it is found or not.
	    {
	    	System.out.println("\nfound the vehicle"); // print found.
	    }
	    else
	    {
	    	System.out.println("\nnot found the vehicle");// print not found.
	    }
	    ArrayList<String> al2=al; // copy the ArrayList 1 to Arraylist 2.
	    
	    System.out.println("\n"+al2); // print the ArrayList 2.
	}

}
