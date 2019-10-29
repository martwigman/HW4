public class LinkedList<T> {
	
	private class Node{
		public T t;
		public Node next;
		public Node(T t, Node next) {
			this.t = t;
			this.next = next;
		}
	}
	
	private int index = 0;
	private int size = 0;
	private Node current;
	private Node head;
	
	
	public boolean isEmpty() {
		return false;
	}
	
	public int size() {
		return 0;
	}
	public void resetIndex() {
		index = 0;
		current = head;
	}
	public void add(T t) {
		if(size==0) {
			head = new Node(t, null);
		}else {
			current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(t, null);
		}
		size++;
		resetIndex();
	}
	public void add(int index, T t) {
		//head.next = new Node(t, head.next)
		resetIndex();
	}
	
	public T get(int index) {
		
		return null;
	}
	
	public T remove(int index) {
		resetIndex();
		return null;
	}
	public T delete(LinkedList<T> found) {
		resetIndex();
		return null;
	}
	public void printList() {
		//print the list 
		printList();
	}
	

}