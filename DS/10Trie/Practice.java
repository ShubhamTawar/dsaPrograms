import java.util.*;

class TrieNode{
	TrieNode[] children = null;
	int wordEnd  		= 0;

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

	void insert(String s , int start , TrieNode root){
		char ch = s.charAt(start);
		if(s.length() - 1 == start){
			if(root.children[ch - 'a'] == null)
				root.children[ch - 'a'] = new TrieNode();
			root.wordEnd++;
		}else{
		  if(root.children[ch - 'a'] == null)
				root.children[ch - 'a'] = new TrieNode();
			
		insert(s , start + 1 , root.children[ch - 'a']);
	    }
	 }

	boolean search(String s , int start , TrieNode root){
		char ch = s.charAt(start);

		if(root.children[ch - 'a'] == null)
				return false;
		else if(s.length() - 1 == start)
		        return root.wordEnd > 0;
		else
		  return search(s , start + 1 , root.children[ch - 'a']);
	}

	public static void main(String[] args) {
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