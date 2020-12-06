
public class SimpleStack {
	char[] data;
	int tos;

	SimpleStack(int size) {
		data = new char[size];
		tos = 0;
	}

	void push(char ch) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		data[tos] = ch;
		tos++;

	}

	char pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty");
			return (char) 0;
		}
		tos--;
		return data[tos];
	}

	boolean isFull() {
		return tos == data.length;
	}

	boolean isEmpty() {
		return data[0] == tos;
	}

}

class SimpleStackDemo {
	public static void Main(String[] args) {
		int i;
		char ch;
		
		System.out.println("Demonstrate SimpleStack\n");
		
		SimpleStack stack = new SimpleStack(10);
		System.out.println("Push 10 items onto a 10 ellement stack");
		
		System.out.println("Pushing");
		for (ch = 'A';  ch < 'K'; ch++) {
			System.out.println(ch);
			stack.push(ch);
			
		}
		
		System.out.println("\nPop those items from the stack");
		
		//now pop the items off, notice the order is reversed.
		
		System.out.println("Poping");
		for (int j = 0; j < 10; j++) {
			ch = stack.pop();
			System.out.println(ch);
			
			
		}
		
		System.out.println("/n/nNext use isEmpty() and isFull() to fill and empty the stack");
		//push the letters until the stack is full
		System.out.println("Pussing");
		for (ch = 'A'; !stack.isFull(); ch++) {
			System.out.println(ch);
			stack.push(ch);
			
		}
		
		System.out.println();
		
		//now pop the items off
		System.out.println("Popping: ");
		while (!stack.isEmpty()) {
			ch = stack.pop();
			System.out.println(ch);
		}
		
		System.out.println("\n\nNow use a 4-element stack to generate some errors");
		
		//Generate some errors
		SimpleStack smallStack = new SimpleStack(4);
		//Attempt to push 5 characters onto smallStack
		System.out.println("Pushing: ");
		for (ch = '1'; ch < '6'; ch++) {
			System.out.println(ch);
			smallStack.push(ch);
			
		}
		
		//Attempt to pop 5 characters form a 4-element stack.
		System.out.println("Popping :");
		for (i = 0; i < 5; i++) {
			ch = smallStack.pop();
			System.out.println(ch);
			
		}
		
	}
	
}

