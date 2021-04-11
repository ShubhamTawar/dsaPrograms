import java.util.*;

class TrieNode{
	TrieNode[] children = null;
	int wordEnd		   = 0;

	TrieNode(){
		children = new TrieNode[26];
		wordEnd  = 0;
	}
}


class Trie{
    TrieNode root = null;

	Trie(){
		root = new TrieNode();
	}

   // Insert a new word in the Trie

	public void insert(String s , int start , TrieNode root){
		//char c = s.charAt(start);
		int idx = s.charAt(start) - 'a';
	//		cnt++;
		if(s.length() - 1 == start){
			
			if(root.children[idx] == null)
				root.children[idx] = new TrieNode();
			
				root.children[idx].wordEnd++;
			
		}else{
		    if(root.children[idx] == null)
				root.children[idx] = new TrieNode();
			
			insert(s , start + 1 , root.children[idx]);
		}
	}

	// Search given word in the Trie

	public boolean search(String s , int start , TrieNode root){
	//	char c = s.charAt(start);		
		int idx = s.charAt(start) - 'a';
		if(root == null)
			return false;

		if(s.length() - 1 == start){
			if(root.children[idx] != null && root.children[idx].wordEnd > 0){
				return true;
			}
			else
				return false;
		}else{
			if(root.children[idx] == null)
				return false;
			else
				return search(s , start + 1 , root.children[idx]);
		}
	}

	// Deleting a node from the trie

	public boolean delete(String s , int start , TrieNode root){
		if(root == null){
		//	System.out.println("3");
			return false;
		}
		int idx = s.charAt(start) - 'a';

		if(s.length() == start + 1){
			if(root.children[idx] != null && root.children[idx].wordEnd > 0){
			//	System.out.println("1");
					root.children[idx].wordEnd--;
					return true;
				}
			else{
			//	System.out.println("2");
			   return false;
			}
		}else
		   return delete(s , start + 1 , root.children[idx]);
	}

	public static void main(String[] args) {

		/*
		Trie trie = new Trie();

		trie.insert("abc" , 0 , trie.root);
		trie.insert("abd" , 0 , trie.root);
		
		System.out.println(trie.search("abd" , 0 , trie.root));
		System.out.println(trie.search("abc" , 0 , trie.root));
		System.out.println(trie.search("ab" , 0 , trie.root));
        System.out.println(trie.search("abcd" , 0 , trie.root));
		*/


      /* Trie head = new Trie();
 
        head.insert("techie" , 0 , head.root);
        head.insert("techi" , 0 , head.root);
        head.insert("tech" , 0 , head.root);
 
        System.out.println(head.search("tech" , 0 , head.root));            // true
        System.out.println(head.search("techi" , 0 , head.root));           // true
        System.out.println(head.search("techie" , 0 , head.root));          // true
        System.out.println(head.search("techiedelight" , 0 , head.root));   // false
 
        head.insert("techiedelight" , 0 , head.root);
 
        System.out.println(head.search("tech" , 0 , head.root));            // true
        System.out.println(head.search("techi" , 0 , head.root));           // true
        System.out.println(head.search("techie" , 0 , head.root));          // true
        System.out.println(head.search("techiedelight" , 0 , head.root));   // true
		*/

		Trie trie = new Trie();

		/*
		trie.insert("abc" , 0 , trie.root);
		trie.insert("abcd" , 0 , trie.root);
		trie.insert("abd" , 0 , trie.root);

		System.out.println(trie.search("abc" , 0 , trie.root));
		System.out.println(trie.search("abbc" , 0 , trie.root));
		System.out.println(trie.search("abcd" , 0 , trie.root));
		System.out.println(trie.search("abd" , 0 , trie.root));
 	 		
 		trie.insert("abdd" , 0 , trie.root);
		trie.insert("abccd" , 0 , trie.root);

		System.out.println(trie.search("abd" , 0 , trie.root));
 		*/

 		/*trie.insert("ab" , 0 , trie.root);
 		trie.insert("aba" , 0 , trie.root);
 		trie.insert("bab" , 0 , trie.root);
 		trie.insert("b" , 0 , trie.root);
 		trie.insert("ab" , 0 , trie.root);

 		
 		System.out.println(trie.delete("ba" , 0 , trie.root));    // false
 		System.out.println(trie.delete("bab" , 0 , trie.root));	 // true
 		System.out.println(trie.search("bab" , 0 , trie.root));	 // false
 		System.out.println(trie.delete("abc" , 0 , trie.root));	 // false
 		System.out.println(trie.search("abc" , 0 , trie.root));	 // false
 		System.out.println(trie.search("ab" , 0 , trie.root));	 // true
 		System.out.println(trie.delete("ab" , 0 , trie.root));	 // true
 		System.out.println(trie.delete("ab" , 0 , trie.root));	 // true
		*/
 		
 		/*System.out.println(trie.search("ab" , 0 , trie.root));	 // false
 		System.out.println(trie.search("aba" , 0 , trie.root));	 // false
 		System.out.println(trie.search("bab" , 0 , trie.root));	 // false
 		System.out.println(trie.search("b" , 0 , trie.root));	 // false
 		System.out.println(trie.search("ab" , 0 , trie.root));	 // false
 		System.out.println(trie.search("abcd" , 0 , trie.root));	 // false
 		
 		System.out.println(trie.delete("bab" , 0 , trie.root));	 // false
  		System.out.println(trie.search("bab" , 0 , trie.root));	 // false
 		*/
 		Scanner sc= new Scanner(System.in);
 		boolean flag = true;
 		int choice = 0;
 		String item = null;
 		while(flag){
 			System.out.println("Enter 1 for insertion....");
 			System.out.println("Enter 2 for deletion....");
 			System.out.println("Enter 3 for searching....");
 			System.out.println("Enter 4 for exit....");
 			
 			System.out.print("Enter your choice...");
 			choice = sc.nextInt();
 			sc.nextLine();
  		switch(choice){
  			case 1:
  			System.out.print("Enter string for insertion....");
  			item = sc.nextLine();
  			trie.insert(item , 0 , trie.root);
  			break;
  			
  			case 2:
  			System.out.print("Enter string for deletion....");
  			item = sc.nextLine();
  			if(trie.delete(item , 0 , trie.root))
  				System.out.println("\n " + item + " has been deleted\n");
  			else
  				System.out.println("\n " + item + " is not present inside trie\n");
  			break;

  			case 3:
  			System.out.print("Enter string for searching....");
  			item = sc.nextLine();
  			if(trie.search(item , 0 , trie.root))
  				System.out.println("\n " + item + " is present inside trie\n");
  			else
  				System.out.println("\n " + item + " is not present inside trie\n");
  			break;

  			case 4:
  			flag = false;
  			break;

  		}
  	    }
	}
}