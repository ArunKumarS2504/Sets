package Sets;

public class Demo {
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		list.insertatfirst(9);
		list.insertatfirst(5);
		list.display();
		System.out.println();
		
		list.insertatPos(1, 10);
		list.insertatPos(0, 2);
		list.display();
	}

}
