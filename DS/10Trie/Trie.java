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
	static int cnt = 0;

	Trie(){
		root = new TrieNode();
	}

   // Insert a new word in the Trie

	public void insert(String s , int start , TrieNode root){
		char c = s.charAt(start);
	//		cnt++;
		if(s.length() - 1 == start){
			
			if(root.children[c - 'a'] == null)
				root.children[c - 'a'] = new TrieNode();
			
				root.wordEnd++;
			
		}else{
		    if(root.children[c - 'a'] == null)
				root.children[c - 'a'] = new TrieNode();
			
			insert(s , start + 1 , root.children[c - 'a']);
		}
	}

	// Search given word in the Trie

	public boolean search(String s , int start , TrieNode root){
			cnt++;
		char c = s.charAt(start);		
	
		if(s.length() - 1 == start){
			if(root.wordEnd > 0){
				return true;
			}
			else
				return false;
		}else{
			if(root.children[c - 'a'] == null)
				return false;
			else
				return search(s , start + 1 , root.children[c - 'a']);
		}
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
 		
	}
}