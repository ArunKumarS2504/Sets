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

    // Insert a new node at a specific position
    public void insertAtPos(int pos, int val) {
        if (pos == 0) {
            insertAtFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) { // Jump to the previous node
            temp = temp.next;
            if (temp == null) {
                throw new IllegalArgumentException("Invalid position " + pos);
            }
        }
        newNode.next = temp.next;
        if (temp.next != null) { // Update the previous pointer of the next node
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    // Delete the first node of the list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next != null) {
            head.next.prev = null;
        }
        head = head.next;
    }
    
    // Delete a node at a specific position
    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            if (temp.next == null) {
                throw new IllegalArgumentException("Invalid position " + pos);
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            throw new IllegalArgumentException("Invalid position " + pos);
        }
        Node nodeToDelete = temp.next;
        temp.next = nodeToDelete.next;
        if (nodeToDelete.next != null) { // Update the previous pointer of the next node
            nodeToDelete.next.prev = temp;
        }
    }
    
    // Delete the last node of the list
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) { // If only one node exists
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) { // Traverse to the second last node
            temp = temp.next;
        }
        temp.next = null;
    }
}
