import java.util.*;

class TrieNode{
		TrieNode[] children = null;
		int wordEnd			= 0;

		TrieNode(){
			children = new TrieNode[26];
			wordEnd	 = 0;
		}
	}

class Trie{
		TrieNode root = null;

		Trie(){
			root = new TrieNode();
		}

		public void insert(String s){
			int i   = 0;
			int idx = -1;

			TrieNode temp = root;
			int cnt = 0;
			while(i < s.length()){
				idx = s.charAt(i) - 'a';

				if(temp.children[idx] == null)
					temp.children[idx] = new TrieNode();
				
				temp = temp.children[idx];
				i++;
			}
			
			temp.wordEnd = temp.wordEnd + 1;
		}

		

		public boolean search(String s){
			int i   = 0;
			int idx = -1;

			TrieNode temp = root;

			while(i < s.length()){
				idx = s.charAt(i) - 'a';

				if(temp.children[idx] == null)

					return false;
				

				temp = temp.children[idx];
				i++;
			}

			if(temp.wordEnd > 0)
				return true;
			else
				return false;
		}

		public boolean removeWord(String s){
			int i   = 0;
			int idx = -1;

			TrieNode temp = root;

			while(i < s.length()){
				idx = s.charAt(i) - 'a';
				if(temp.children[idx] == null)
					return false;

				temp = temp.children[idx];
				i++;
			}

			if(temp.wordEnd > 0){
				temp.wordEnd = temp.wordEnd - 1;
				return true;
			}else
				return false;
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