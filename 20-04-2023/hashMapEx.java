package practicalProgram; // Create package.

import java.util.Map; // import Map.
import java.util.Set; // import Set.
import java.util.HashMap; // import HashMap.
import java.util.Iterator; // import Iterator.
public class hashMapEx {  //Create a Main Class .

	public static void main(String[] args) { // Create a main() method.
		Map m=new HashMap(); // create an object of HashMap.
		m.put(101, "Mueez"); // all data by using put(key,object) method. 
		m.put(102,"Zidan"); // all data by using put(key,object) method.
		m.put(103, "Mazen"); // all data by using put(key,object) method.
		m.put(104, "Mantasha"); // all data by using put(key,object) method.
		m.put(105, "Safiya"); // all data by using put(key,object) method.
		m.put(106, "Haroon"); // all data by using put(key,object) method.

		Set s=m.entrySet(); //Create a Set and put data into the Set.
		Iterator i=s.iterator(); // Create an object of Iterator.
		while(i.hasNext()) // call hasNext() method to store all data into the i variable.
		{
			Map.Entry e=(Map.Entry)i.next(); // Create Map Object e and store the data one by one.
			System.out.println(e); // print all elements of Map.
		}
		
		if(m.containsKey(105)) // check the 105 key data id exist or no in HashMap.
		{
			System.out.println("Key Exist."); // print Exist.
		}
		else
		{
			System.out.println("Key not Exist."); // print not Exist.
		}
		System.out.println("No of Key Values are  :"+m.size() ); // print the size/count of the key-Data in HashMap.
		
		Map m2=m; // copy the one Map to another Map.
		
		Set s1=m.entrySet();//Create a Set and put data into the Set.
		Iterator ii=s1.iterator(); // Create an object of Iterator.
		while(i.hasNext()) // call hasNext() method to store all data into ii variable.
		{
			Map.Entry e1=(Map.Entry)ii.next();// Create Map Object e1 and store the data one by one.
			System.out.println(e1); //print all elements of Map.
		}
	}

}
