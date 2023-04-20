package practicalProgram; // Create a Package.

import java.util.LinkedList; //import LinkedList.
import java.util.ListIterator; // import ListIterator.

public class LinkedListEx { // Create main Class.

	public static void main(String[] args) { // create main() method.
		LinkedList ll=new LinkedList(); // create an object of LinkedList.
		ll.add("Yellow"); // call add() method to add elements in LinkedList.
		ll.add("Green");// call add() method to add elements in LinkedList.
		ll.add("Pink");// call add() method to add elements in LinkedList.
		ll.add("Black");// call add() method to add elements in LinkedList.
		
		System.out.println(ll);// print the LinkedList.
		ll.addLast("Red"); // call addLast() method to add element at the last.
		System.out.println(ll); // print elements of Linked List.
		ListIterator li=ll.listIterator(); // Create an object of ListIterator clss.
		while(li.hasNext()) // call hasNext() method.
		{
			String s=(String)li.next(); // convert the elements into String format and call next() method for next element.
			System.out.println(s); // print the all elements in iteration . 
		}
		System.out.println("\nReverse Order is :\n"); // print msg.
		while(li.hasPrevious()) // call hasPrivious() method for reverse the LinkedList.
		{
			System.out.println(li.previous()); // call privious() method to get the next element.
		}
		
	}

}
