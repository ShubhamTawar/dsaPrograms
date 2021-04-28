import java.util.*;

class TrieNode{
	TrieNode[] children = null;
	int wordEnd = 0;

	TrieNode(){
		children = new TrieNode[256];
		wordEnd = 0;
	}
}

class Trie{
	TrieNode root = null;

	Trie(){
		root = new TrieNode();
	}

	public void insert(String s){
		char c = '0';
		TrieNode t = root;
		for(int i = 0 ; i < s.length() ; i++){
			c = s.chatAt(i);
			if(t.children[c] == null)
				t.children[c] = new TrieNode();

			t = t.children[c];
		}

		t.wordEnd = t.wordEnd + 1;

	}

	public boolean search(String s){
		char c = '0';

		TrieNode t = root;

		for(int i = 0 ; i < s.length() ; i++){
			 c = s.charAt(i);

			 if(t.children[c] == null)
			 	return false;
		}
	}

	public static void main(String[] args) {
		Trie trie = new Trie();

	        trie.insert("abc");
			trie.insert("shubham");
			trie.insert("shubh");
			trie.insert("shu");

			System.out.println(trie.search("abc"));
			System.out.println(trie.search("shubha"));
			System.out.println(trie.search("shubham"));
			System.out.println(trie.search("shubhams"));

			System.out.println(trie.removeWord("abc"));
			System.out.println(trie.search("abc"));
			System.out.println(trie.removeWord("soham"));

			trie.insert("abc");
			System.out.println(trie.search("abc"));
			System.out.println(trie.removeWord("abc"));

	}
}