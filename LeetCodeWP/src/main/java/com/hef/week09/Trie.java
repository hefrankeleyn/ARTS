package com.hef.week09;

/**
 * @Date 2021/5/18
 * @Author lifei
 */
public class Trie {

    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node!=null && node.isEnd;
    }

    public boolean startWith(String prefix) {
        Trie node = searchPrefix(prefix);
        return node!=null;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i=0; i<prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c-'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}
