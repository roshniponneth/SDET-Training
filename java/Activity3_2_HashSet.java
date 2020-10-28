import java.util.HashSet;
import java.util.Set;

public class Activity3_2_HashSet {
	public static void main(String[] args) {
	Set<String> Hs = new HashSet<>();
	     //Add 6 objects using add() method to the HashSet.
		Hs.add("Toyota Camry");
		Hs.add("Honta Civic");
		Hs.add("Honta City");
		Hs.add("Ford Figo");
		Hs.add("Maruthi AltoK10");
		Hs.add("Toyota Corola");
		
		//print the size of the HashSet using the size() method	
		System.out.println("The HashSet has " + Hs.size() + " elements in the beginning");
		
		
		//Remove an element using the remove() method.
	    if (Hs.remove("Ford Figo"))
	    {
	    System.out.println("Ford Figo is removed");
	    }
		//Also try to remove an element that is not present in the Set
	    Hs.remove("Ford"); 
	  // Use the contains() method to check if an item is in the Set or not.
	    System.out.println("Is Honta Civic present in the group ---True/False? " + Hs.contains("Honta Civic"));

	    //Print the updated set
	    System.out.println("The updated HashSet has " + Hs.size() + " elements now");
	   
		}

}
