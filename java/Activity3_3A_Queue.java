import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A_Queue {

	public static void main(String[] args) {
		
	Queue<Integer> nameQueue =  new LinkedList<>();
	//Add first 5 natural numbers to it and print the Queue
	nameQueue.add(1);
	nameQueue.add(2);
	nameQueue.add(3);
	nameQueue.add(4);
	nameQueue.add(5);

	for (Integer i:nameQueue)
    {
    	System.out.println(i);
    }
	System.out.println("Size of the Queue in the beginning: " + nameQueue.size());
	
		//Remove a number in the Queue using the remove() method
	if (nameQueue.remove(3))
    {
    System.out.println("3 is removed");
    }
	//Peek() at the first number in the Queue after removal.
	System.out.println("Head of the Queue: " + nameQueue.peek());
	
	//Print the size of the Queue using the size() method.
	System.out.println("Updated size of the Queue : " + nameQueue.size());
	
	//Print the updated Queue.
	
	
	}

}
