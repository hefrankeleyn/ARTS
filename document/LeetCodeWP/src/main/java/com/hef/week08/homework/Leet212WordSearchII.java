package com.hef.week08.homework;

import java.util.*;

/**
 * @Date 2021/5/30
 * @Author lifei
 */
public class Leet212WordSearchII {


    public static void main(String[] args) {
        /*char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};*/

        /*char[][] board ={
                {'o','a','b','n'},
                {'o','t','a','e'},
                {'a','h','k','r'},
                {'a','f','l','v'}
        };

        String[] words = {"oa",  "oaa"};*/

        char[][] board = {{'a','b'}};
        String[] words = {"ab"};

        Leet212WordSearchII wordSearchII = new Leet212WordSearchII();

        List<String> result = wordSearchII.findWords(board, words);
        System.out.println(result);

    }

    private int[] dx = {0, 0, 1, -1};
    private int[] dy = {-1, 1, 0, 0};


    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        Trie trie = new Trie();

        for (String w: words) {
            trie.insert(w);
        }

        Set<String> resSet = new HashSet<>();
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                dfs(i, j, board, new StringBuilder(), trie, resSet);
            }
        }
        result.addAll(resSet);


        return result;
    }

    private void dfs(int i, int j, char[][] board, StringBuilder sb, Trie trie, Set<String> resSet) {
        sb.append(board[i][j]);
        char c = board[i][j];
        int n = sb.length();
        board[i][j] = '@';
        if (trie.searchWord(sb.toString())) {
            resSet.add(sb.toString());
        }

        for (int x=0; x<dx.length; x++) {
            int x1 = i + dx[x];
            int y1 = j + dy[x];
            if (x1>=0 && x1<board.length && y1>=0 && y1<board[x1].length && board[x1][y1]!='@') {
                if (trie.isPrefix(sb.toString()+board[x1][y1])) {
                    dfs(x1, y1, board, sb, trie, resSet);
                }
            }
        }
        board[i][j] = c;
        sb.deleteCharAt(n-1);
    }

    class Trie {
        private Trie[] children;
        private boolean isEnd;

        public Trie() {
            this.children = new Trie[26];
            this.isEnd = false;
        }

        public void insert(String word) {
            Trie node = this;
            for (int i=0; i<word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index]==null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }

        public boolean isPrefix(String str) {
            return searchPrefix(str)!=null;
        }

        public boolean searchWord(String str) {
            Trie node = searchPrefix(str);
            return node!=null && node.isEnd;
        }

        public Trie searchPrefix(String str) {
            Trie node = this;
            for (int i=0; i<str.length(); i++) {
                int index = str.charAt(i) - 'a';
                if (node.children[index]==null) {
                    return null;
                }
                node = node.children[index];
            }
            return node;
        }
    }



}
