
class MyStack{
	static int[] stack ;
	static int size ;
	static int top;

	MyStack(int size){
		stack = new int[size];
		top   = -1;
		this.size = size;
	}

	public static void push(int item){
		if(top == size){
			System.out.println("Stack Overflow!");
			return;
		}

		stack[++top] = item;
	}

	public static int pop(int item){
		if(top == -1){
			System.out.println("Stack Underflow!");
			return -1;
		}
	}
}