package Sets;

public class Demo {
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		// Inserting elements at the beginning
				list.insertatfirst(9);
				list.insertatfirst(5);
				System.out.print("List after inserting 9 and 5 at first: ");
				list.display(); // Output: 5 9
				System.out.println();
				
				// Inserting elements at specific positions
				list.insertatPos(1, 10);
				System.out.print("List after inserting 10 at position 1: ");
				list.display(); // Output: 5 10 9
				System.out.println();
				
				list.insertatPos(0, 2);
				System.out.print("List after inserting 2 at position 0: ");
				list.display(); // Output: 2 5 10 9
				System.out.println();
				
				// Deleting the first element
				list.deleteFirst();
				System.out.print("List after deleting the first element: ");
				list.display(); // Output: 5 10 9
				System.out.println();

				// Deleting an element at a specific position
				list.deleteAtPos(1);
				System.out.print("List after deleting element at position 1: ");
				list.display(); // Output: 5 9
				System.out.println();
				
				// Deleting the last element
				list.deleteLast();
				System.out.print("List after deleting the last element: ");
				list.display(); // Output: 5
				System.out.println();
	}

}
