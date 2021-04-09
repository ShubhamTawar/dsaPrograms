import java.util.*;

class MyStack{
	int[] stack;
	int size;
	int top;
    static Scanner sc = null;
	MyStack(int size){
		this.size = size;
		stack = new int[this.size];	
		top = -1;
		sc = new Scanner(System.in);
	}

	public  void push(){
		int item ;
		System.out.print("Enter item for pushing..");
		item = sc.nextInt();
		if(top == size){
 			System.out.println("Stack overflow!");
 			return;
		}
		stack[++top] = item;

	}
	public  void pop(){
		if(top == -1){
			System.out.println("Stack underflow!");
			return;
		}

		System.out.println(stack[top--] + " popped from the stack");
	}

	public void peek(){
		if(top == -1){
			System.out.println("Stack underflow!");
			return;
		}
		System.out.println(stack[top] + " peeked from the stack");
	}

	public static void main(String[] args) {
		MyStack ms = new MyStack(100);
		boolean flag = true;
		

		while(flag){
			System.out.println("Enter 1 for pushing an element on the stack");
			System.out.println("Enter 2 for poping an element from the stack");
			System.out.println("Enter 3 for peeking an element from the stack");
			System.out.println("Enter 4 for exiting");

			int choice = sc.nextInt();

			switch(choice){
				case 1 :
				  ms.push();
				  break;
				case 2 :
				  ms.pop();
				  break;
				case 3 :
				  ms.peek();
				  break;
				case 4 :
				   flag = false;
				   break;

			}
		}
	}
}

