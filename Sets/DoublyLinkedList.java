package Sets;

public class DoublyLinkedList {
			
Node head; // head of the list
    
    // Node class representing each node in the list
    class Node {
        int data;
        Node next;
        Node prev; // Reference to the previous node
        
        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    
    // Constructor to initialize an empty list
    DoublyLinkedList() {
        head = null;
    }
    
    // Insert a new node at the beginning of the list
    public void insertAtFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) { // When the list is empty
            head = newNode;
        } else { // When the list is not empty
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    // Display the list from the beginning to the end
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
