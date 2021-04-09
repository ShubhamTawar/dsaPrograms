import java.util.*;

class MyQueue{
	int front;
	int rear;
	int[] queue;
	Scanner sc = null;
	int size;
	MyQueue(int size){
		this.size = size;
		queue = new int[this.size];
		front = 0;
		rear  = -1;
		sc = new Scanner(System.in);
	}

	public void enQueue(){
		System.out.println("Enter the item for insertion...");
		int item = sc.nextInt();

		if(rear + 1 == size){
			System.out.println("Queue is Full!");
			return;
		}
		queue[++rear] = item;
	}

	public void deQueue(){
		if(front > rear){
			System.out.println("Queue is Empty!");
			return;
		}
		System.out.println(queue[front++] + " deleted from the queue");
	}
	
	public void peek(){
		if(front > rear){
			System.out.println("Queue is Empty!");
			return;
		}
		System.out.println(queue[front] + " peeked from the queue");
	}
	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue(100);
		boolean flag = true;

		while(flag){
			System.out.println("Enter 1 for enquing an element");
			System.out.println("Enter 2 for dequing an element");
			System.out.println("Enter 3 for peeking an element");
			System.out.println("Enter 4 for exiting the operations");
			System.out.print("Enter your choice....");
			int choice = mq.sc.nextInt();

			switch(choice){
				case 1 :
				  mq.enQueue();
				  break;
				case 2 :
				  mq.deQueue();
				  break;
				case 3 :
				  mq.peek();
				  break;
				case 4 :
				   flag = false;
				   break;
			}
		}

	}
}