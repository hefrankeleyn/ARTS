package com.hef.review.review01sort.work01;

/**
 * @Date 2021/7/4
 * @Author lifei
 */
public class LeetCode1244DesignALeaderboard {


    private static class Leaderboard{

        private Player[] board;
        private int size;
        public Leaderboard() {
            board = new Player[100];
            size = 0;
        }

        public void addScore(int playerId, int score) {
            int i = findPlayer(playerId);
            if (i==-1) {
                Player player = new Player(playerId, score);
                i = size;
                if (size==board.length) {
                    resize(size*2);
                }
                board[size++] = player;
            }else {
                board[i].score = board[i].score+score;
            }
            Player v = board[i];
            int j=i-1;
            while (j>=0 && board[j].score<v.score) {
                board[j+1] = board[j];
                j--;
            }
            board[j+1] = v;
        }

        public int top(int K) {
            int res = 0;
            for (int i=0; i<K && i<size; i++) {
                res  += board[i].score;
            }
            return res;
        }

        public void reset(int playerId) {
            int i = findPlayer(playerId);
            if (i==-1) return;
            int j = i+1;
            while (j<size) {
                board[j-1] = board[j];
                j++;
            }
            size--;
            board[j-1]=null;
        }

        private void resize(int capacity) {
            Player[] a = new Player[capacity];
            for (int i=0; i<size; i++) {
                a[i] = board[i];
            }
            board = a;
        }

        /**  查询用户  **/
        private int findPlayer(int playerId) {
            for (int i=0; i<size; i++) {
                if (board[i].playerId==playerId) {
                    return i;
                }
            }
            return -1;
        }

        private static class Player{
            int playerId;
            int score;
            public Player(int playerId, int score) {
                this.playerId = playerId;
                this.score = score;
            }
        }
    }

}
