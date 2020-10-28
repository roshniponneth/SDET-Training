import java.util.Deque;
import java.util.LinkedList;

public class Activity3_3B_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String> animals = new LinkedList<>();

animals.add("Dog");
animals.add("Horse");
animals.add("Hen");
animals.addFirst("Cat");
animals.addLast("Giraffe");

//Print the size of the Queue using the size() method.
	System.out.println("The size of the Queue : " + animals.size());
	
 //Peek() at the head element and the tail element of the queue.
System.out.println("first element: " + animals.peekFirst());
System.out.println("last element: " + animals.peekLast());
//Remove() the first and last element from the queue.

//Check if there is a Wolf present in the queue using the contains() method.
System.out.println("Is Wolf present in the group ---True/False? " + animals.contains("Wolf"));

//Remove() the first and last element from the queue
animals.removeFirst();

animals.removeLast();

//Print the size of the Queue using the size() method.
	System.out.println("Updated size of the Queue : " + animals.size());
	
	}

}
