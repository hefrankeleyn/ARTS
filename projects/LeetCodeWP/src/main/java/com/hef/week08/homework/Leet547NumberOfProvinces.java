package com.hef.week08.homework;

/**
 * @Date 2021/5/31
 * @Author lifei
 */
public class Leet547NumberOfProvinces {

    public static void main(String[] args) {
        Leet547NumberOfProvinces numberOfProvinces = new Leet547NumberOfProvinces();
        int[][] isConnected = {{1,1,0},{1,1,0}, {0,0,1}};
        int res = numberOfProvinces.findCircleNum(isConnected);
        System.out.println(res);
    }

    public int findCircleNum(int[][] isConnected) {
        if (isConnected==null || isConnected.length==0) return 0;
        int m = isConnected.length;
        boolean[] visited = new boolean[m];
        int res = 0;
        for (int i=0; i<m; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited, m);
                res++;
            }
        }

        return res;
    }

    private void dfs(int i, int[][] isConnected, boolean[] visited, int m) {
        for (int j=0; j<m; j++) {
            if (isConnected[i][j]==1 && !visited[j]) {
                visited[j] = true;
                dfs(j, isConnected, visited, m);
            }
        }
    }
}
