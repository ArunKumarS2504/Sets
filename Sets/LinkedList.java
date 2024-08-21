package Sets;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data=val;
			next = null;
		}
	}
	
	
	LinkedList(){
		head = null;
	}
	
	public void insertatfirst(int val){
		Node newNode = new Node(val);
		
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}

}
