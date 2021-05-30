package com.hef.week08.homework;

import java.util.*;

/**
 * @Date 2021/5/30
 * @Author lifei
 */
public class Leet212WordSearchII {


    public static void main(String[] args) {
        System.out.println('z'-'a');
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}};

        String[] words = {"oath","pea","eat","rain"};

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
                dfs(i, j, board, "", trie, resSet);
            }
        }
        result.addAll(resSet);


        return result;
    }

    private void dfs(int i, int j, char[][] board, String res, Trie trie, Set<String> resSet) {
        if (i<0 || i>=board.length || j<0 || j>board.length) {
            return;
        }


        if (trie.searchWord(res+board[i][j])) {
            resSet.add(res+board[i][j]);
            return;
        }

        for (int x=0; x<dx.length; x++) {
            int x1 = i + dx[x];
            int y1 = i + dy[x];
            dfs(x1, y1, board, res, trie, resSet);
        }

    }

    class Trie {
        private Trie[] children;
        private boolean isEnd;

        public Trie() {
            this.children = new Trie[26];
            this.isEnd = true;
        }

        public void insert(String word) {
            Trie node = this;
            for (int i=0; i<word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index]==null) {
                    node.children[index] = new Trie();
                }
                node.isEnd = false;
                node = node.children[index];
            }
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
