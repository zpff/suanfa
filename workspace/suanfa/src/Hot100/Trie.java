package Hot100;

public class Trie {

    Trie[] next = new Trie[26];
    boolean isEnd = false;
    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node = this;
        char[] wordChars = word.toCharArray();
        for (char c:
             wordChars) {
            if(node.next[c-'a'] == null){
                node.next[c-'a'] = new Trie();
            }
            node = node.next[c-'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node  = this;
        char[] wordCars = word.toCharArray();
        for (char c:
             wordCars) {
            if(node.next[c-'a'] == null) return false;
            node = node.next[c-'a'];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node  = this;
        char[] wordCars = prefix.toCharArray();
        for (char c:
                wordCars) {
            if(node.next[c-'a'] == null) return false;
            node = node.next[c-'a'];
        }
        return true;
    }
}
