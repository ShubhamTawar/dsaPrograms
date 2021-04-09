import java.util.*;


class MyTree{
	
	static Scanner sc = new Scanner(System.in);
	public static Node createTree(){
		Node root = null;

		System.out.print("Enter Data...");
		int data = sc.nextInt();
		
		if(data != -1){
		root = new Node(data);
		System.out.println("Enter left data for " + data);
		root.left = createTree();
		
		System.out.println("Enter right data for " + data);
		root.right = createTree();
		
}		return root;

	}

	public static void inorder(Node root){
		if(root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}
	public static void main(String[] args) {
		Node root = createTree();

		inorder(root);
	}
}

class Node{
	Node left , right;
	int data;

	Node(int data){
 		this.data = data;
 		left = right = null;
	}
}