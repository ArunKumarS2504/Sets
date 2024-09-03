package Sets;

public class DoublyLinkedListDemo {
		
	public static void main(String arg[]) {
	

		DoublyLinkedList list = new DoublyLinkedList();
	    
	    // Inserting elements at the beginning
	    list.insertAtFirst(9);
	    list.insertAtFirst(5);
	    System.out.print("List after inserting 9 and 5 at first: ");
	    list.display(); // Output: 5 9
	}
	
}
