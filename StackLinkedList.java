package stackImplementationUsingLinkedList;

class StackUnderFlow extends Exception {
	StackUnderFlow() {
		super("No data in stack");
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {

		this.data = data;
		this.next = null;
	}

}

class Stack {
	Node top;
	int size;

	public Stack() {

		this.top = null;
		this.size=0;
	}

	public void push(int element) {
		Node temp = new Node(element);
		temp.next = top;
		top = temp;
		size++;

	}

	public int pop() throws Exception {
		if (top == null) {
			throw new StackUnderflowError();
		}
		int ele = top.data;
		top = top.next;
		size--;
		return ele;
	}
	public int size() {
		
		return this.size ;
		
	}

	public int peek() throws Exception {
		if (top == null) {
			throw new StackUnderflowError();
		}
		
		
		return  this.top.data;
	}
boolean isempty() {
	return top==null;
}
}

public class StackLinkedList  {

	public static void main(String[] args) throws Exception {
		Stack ms = new Stack();
		System.out.println(ms.isempty());
		ms.push(10);
//		System.out.println(ms.size());
		ms.push(20);
		ms.push(30);
//		System.out.println(ms.size());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.size());
//		System.out.println(ms.pop());
		System.out.println(ms.peek());
		ms.pop();
		System.out.println(ms.peek());
		System.out.println(ms.isempty());
	}

}
