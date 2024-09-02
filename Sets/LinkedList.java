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
		//when list is empty
		if(head==null) {
			head=newNode;
		}else {//list is not empty
			newNode.next=head;
			head=newNode;
		}
	}

	public void display(){
		Node temp=head;
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}
	
	public void insertatPos(int pos, int val){
		if(pos==0) {
			insertatfirst(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos;i++) {//jump to prev node
			temp=temp.next;
			if(temp==null) {
//				System.out.println("invalid position");
				throw new IllegalArgumentException("Invalid position"+pos);
			}
		}
		newNode.next = temp.next;// store the ref first and insert next
		temp.next = newNode;
		
	}
	// Delete the first node
		public void deleteFirst() {
			if (head == null) {
				System.out.println("List is empty");
				return;
			}
			head = head.next;
		}
		

}
