package com.hef.review.review05trie;

import java.util.*;
/**
 * @Date 2021/8/4
 * @Author lifei
 */
public class LeetCode212WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        // 创建并初始化Trie
        Trie trie = new Trie();
        for (String word: words) {
            trie.insert(word);
        }
        // 查询数值
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                sb.append(board[i][j]);
                board[i][j] = '@';
                dfs(board, set, i, j, trie, dx, dy, sb);
                board[i][j] = sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return new ArrayList<>(set);
    }

    private void dfs(char[][] board, Set<String> set, int i, int j, Trie trie, int[] dx, int[] dy, StringBuilder sb) {
        if (!trie.searchPrefix(sb.toString())) return;
        if (trie.searchWord(sb.toString())) {
            set.add(sb.toString());
        }
        for (int k=0; k<dx.length; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x<0 || x>=board.length || y<0 || y>=board[0].length) continue;
            if (board[x][y]=='@') continue;
            sb.append(board[x][y]);
            board[x][y] = '@';
            dfs(board, set, x, y, trie, dx, dy, sb);
            board[x][y] = sb.charAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static class Trie {

        private TrieNode root;;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (int i=0; i<word.length(); i++) {
                if (!node.contains(word.charAt(i))) {
                    node.putNode(word.charAt(i), new TrieNode());
                }
                node = node.findNode(word.charAt(i));
            }
            node.setEnd();
        }

        public boolean searchWord(String word) {
            TrieNode node = findPrefix(word);
            return node!=null && node.isEnd();
        }

        public boolean searchPrefix(String prefix) {
            return findPrefix(prefix)!=null;
        }

        private TrieNode findPrefix(String prefix) {
            TrieNode node = root;
            for (int i=0; i<prefix.length(); i++) {
                if (node.contains(prefix.charAt(i))) {
                    node = node.findNode(prefix.charAt(i));
                }else {
                    return null;
                }
            }
            return node;
        }


        public static class TrieNode {
            private TrieNode[] nodes;
            private boolean isEnd;
            private static final int capacity=26;
            public TrieNode() {
                nodes = new TrieNode[capacity];
            }

            public boolean contains(char ch) {
                return nodes[ch-'a']!=null;
            }

            public TrieNode findNode(char ch) {
                return nodes[ch-'a'];
            }

            public void putNode(char ch, TrieNode node) {
                nodes[ch-'a']=node;
            }

            public boolean isEnd() {
                return isEnd;
            }

            public void setEnd() {
                isEnd=true;
            }
        }
    }
}
