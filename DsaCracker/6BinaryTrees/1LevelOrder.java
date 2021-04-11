import java.util.*;

class Node{
	Node left , right;
	int data;

	Node(int data){
		left = right = null;
		this.data = data;
	}
}

class MyTree{

	public static Node createTree(){
		System.out.print("Enter data...");
		int data = sc.nextInt();
		Node root = null;

		if(data != -1){
			root = new Node(data);

			System.out.println("Enter left data for " + data);
			root.left = createTree();
			
			System.out.println("Enter right data for " + data);
			root.right = createTree();

		}
		return root;
	}

	public static void levelOrder(Node root){
		Queue<Node> q = new LinkedList<>();

		if(root == null)
			return;

		q.add(root);
        Node t = null;
		while(!q.isEmpty()){
			t = q.remove();
			System.out.print(t.data + " ");

			if(t.left != null)
				q.add(t.left);
			
			if(t.right != null)
				q.add(t.right);

		}

	}
	public static void inorder(Node root){
		if(root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		Node root = createTree();
		inorder(root);
		System.out.println();
		levelOrder(root);
	}
}