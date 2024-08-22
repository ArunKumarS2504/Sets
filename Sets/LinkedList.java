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
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		newNode.next = temp.next;// store the ref first and insert next
		temp.next = newNode;
		
	}

}
