package stackImplementationUsingLinkedList;

import java.util.ArrayList;

class StackUnderflowError extends Exception {

	public StackUnderflowError() {
		super("No element in stack");
	}
}

class StackArrayList {
	ArrayList al;
	int top;

	public StackArrayList() {
		this.al = new ArrayList<Integer>();
		this.top = -1;
	}

	void push(int element) {
		this.al.add(element);

	}

	int pop() throws StackUnderflowError {
		if (this.al.size() == 0) {
			throw new StackUnderflowError();
		}

		int lastindex = this.al.size() - 1;
		int t = (int) this.al.get(lastindex);
		this.al.remove(lastindex);
		return t;

	}
}

public class StackArrayListMain {

	public static void main(String[] args) throws StackUnderflowError {
		StackArrayList myStack = new StackArrayList();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
//		System.out.println(myStack.pop()); 

	}

}
