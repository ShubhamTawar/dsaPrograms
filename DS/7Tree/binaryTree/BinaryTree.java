import java.util.*;

class Tree{
	static Scanner sc = null;
	public static Node createTree(){
		Node root = null;
		System.out.print("Enter data => ");
		int data = sc.nextInt();

		if(data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter left data for " + data);
		root.left = createTree();
		
		System.out.println("Enter right data for " + data);
		root.right = createTree();

		return root;
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);

		Node root = createTree();

		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
	}

	// Traversals
    
    public static void preorder(Node root){
		if(root == null)
			return;

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

    public static void inorder(Node root){
    	if(root == null)
    		return ;

    	inorder(root.left);
    	System.out.print(root.data + " ");
		inorder(root.right);
    }

	public static void postorder(Node root){
		if(root == null)
			return ;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");

	}	

}

class Node{
	Node left , right;
	int data;

	Node(int data){
		this.data = data;
	}
}