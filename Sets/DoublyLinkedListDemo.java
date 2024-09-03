package Sets;

public class DoublyLinkedListDemo {
		
	public static void main(String arg[]) {
	

		DoublyLinkedList list = new DoublyLinkedList();
	    
	    // Inserting elements at the beginning
	    list.insertAtFirst(9);
	    list.insertAtFirst(5);
	    System.out.print("List after inserting 9 and 5 at first: ");
	    list.display(); // Output: 5 9
	    
	    // Inserting elements at specific positions
        list.insertAtPos(1, 10);
        System.out.print("List after inserting 10 at position 1: ");
        list.display(); // Output: 5 10 9
        
        list.insertAtPos(0, 2);
        System.out.print("List after inserting 2 at position 0: ");
        list.display(); // Output: 2 5 10 9
        
        // Deleting the first element
        list.deleteFirst();
        System.out.print("List after deleting the first element: ");
        list.display(); // Output: 5 10 9
        
        // Deleting an element at a specific position
        list.deleteAtPos(1);
        System.out.print("List after deleting element at position 1: ");
        list.display(); // Output: 5 9
        
        // Deleting the last element
        list.deleteLast();
        System.out.print("List after deleting the last element: ");
        list.display(); // Output: 5
	}
	
}
