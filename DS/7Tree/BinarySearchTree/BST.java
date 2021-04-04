import java.util.*;

class Tree{
  static Node root = null;
  static Scanner sc = new Scanner(System.in);

  // Insertion inside the Binary Search Tree

  public static void insert(){
  	System.out.print("Enter the data for insertion....");
  	int data = sc.nextInt();
  	Node node = new Node(data);
  	if(root == null){
  		root = node;
  		return;
  	}
  	Node temp = root;
  	while(true){
  		if(temp.data < data){
  			if(temp.right == null){
  				temp.right = node;
  				break;
  			}else{
  				temp = temp.right;
  			}
  		}else{
  			if(temp.left == null){
  				temp.left = node;
  				break;
  			}else{
  				temp = temp.left;
  			}
  		}
  	}
  }

  public static void preorder(Node root){
  	if(root == null)
  		return ;

  	System.out.print(root.data + " ");
  	preorder(root.left);
  	preorder(root.right);
   }

  public static void inorder(Node root){
  	if(root == null)
  		return;
  	inorder(root.left);
  	System.out.print(root.data + " ");
	inorder(root.right);
  }
 
  public static void postorder(Node root){
  	if(root == null)
  		return;

  	postorder(root.left);
  	postorder(root.right);
  	System.out.print(root.data + " ");

  }


  // Deletion in BinarySearchTree  
    public static int max(Node node){
        if(node.right == null)
        return node.data;
        else
        return max(node.right);
    }
	public static Node deleteNode(Node root, int X)
	{
		if(root == null)
		return null;
		
		if(X < root.data){
		    root.left = deleteNode(root.left , X);
		}else if(X > root.data){
		    root.right = deleteNode(root.right , X);
		}else{
		    if(root.left != null && root.right != null){
		        int lmax = max(root.left);
		        root.data = lmax;
		        root.left = deleteNode(root.left , lmax);
		        return root;
		    }else if(root.left != null){
		        return root.left;
		    }else if(root.right != null){
		        return root.right;
		    }else{
		        return null;
		    }
		}
		return root;
	}

  public static void main(String[] args) {
  		boolean flag = true;
  		while(flag){
  			System.out.println("Enter 1 for insertion");
  			System.out.println("Enter 2 for preorder");
  			System.out.println("Enter 3 for inorder");
  			System.out.println("Enter 4 for postorder");
  			System.out.println("Enter 5 for Deletion");
  			System.out.println("Print other for exiting");
  			int opt = sc.nextInt();

  			switch(opt){
  				case 1 : 
  				   insert();
  				   break;
  				case 2 :
  					preorder(root);
  					System.out.println();
  					break;
  				case 3 :
  					inorder(root);
  					System.out.println();
  					break;
  				case 4 :
  					postorder(root);
  					System.out.println();
  					break;
  				case 5 :
  					System.out.print("Enter item for Deletion....");
  					int item = sc.nextInt();
  					root = deleteNode(root , item);
  					break;
   				default :
  					flag = false;
  					break;
  			}
  		}
  }
}

class Node{
	Node left , right;
	int data;

	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}