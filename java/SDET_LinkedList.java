
import java.util.LinkedList;

	public class SDET_LinkedList {
		public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		
		System.out.println(linkedlist.getFirst());
		System.out.print(linkedlist.getLast());
		linkedlist.remove(1);
		System.out.print(linkedlist.getFirst());	
			}
	}

