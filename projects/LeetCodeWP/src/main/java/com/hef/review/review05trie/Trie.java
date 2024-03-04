package com.hef.review.review05trie;

/**
 * @Date 2021/8/3
 * @Author lifei
 */
public class Trie {

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i=0; i<word.length(); i++) {
            if (!node.contains(word.charAt(i))) {
                node.putNode(word.charAt(i), new TrieNode());
            }
            node = node.getNode(word.charAt(i));
        }
        node.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = findPrefix(word);
        return node!=null && node.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return findPrefix(prefix)!=null;
    }

    private TrieNode findPrefix(String prefix) {
        TrieNode node = root;
        for (int i=0; i<prefix.length(); i++) {
            if (node.contains(prefix.charAt(i))) {
                node = node.getNode(prefix.charAt(i));
            }else {
                return null;
            }
        }
        return node;
    }

    public static class TrieNode {
        private TrieNode[] nodes;
        private boolean isEnd;
        private static final int capacity = 26;

        public TrieNode() {
            nodes  = new TrieNode[capacity];
        }

        public boolean contains(char ch) {
            return nodes[ch-'a']!=null;
        }

        public TrieNode getNode(char ch) {
            return nodes[ch-'a'];
        }

        public void putNode(char ch, TrieNode node) {
            nodes[ch-'a']=node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }
    }
}
