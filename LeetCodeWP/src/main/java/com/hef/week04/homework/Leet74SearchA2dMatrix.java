package com.hef.week04.homework;

/**
 * @Date 2021/4/26
 * @Author lifei
 */
public class Leet74SearchA2dMatrix {

    public static void main(String[] args) {
        Leet74SearchA2dMatrix searchA2dMatrix = new Leet74SearchA2dMatrix();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
//        int[][] matrix = {{1}};
//        int target = 1;
//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//        int target = 11;
        boolean result = searchA2dMatrix.searchMatrix(matrix, target);
        System.out.println(result);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null || matrix.length==0) return false;
        int row = searchRowNum(matrix, target);
        if (target>=matrix[row][0] && matrix[row][matrix[row].length-1]>=target) {
            int col = searchColNum(matrix[row], target);
            if (col>=0) {
                return true;
            }
        }

        return false;
    }

    private int searchColNum(int[] row, int target) {
        int n=row.length-1, left = 0, right=n;
        while(left<=right) {
            int mid = (left + right)/2;
            if (row[mid]==target) return mid;
            if (row[mid]>target) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }

        return -1;
    }

    private int searchRowNum(int[][] matrix, int target) {
        int n= matrix.length-1, left = 0, right = n;
        int res = 0;
        while (left<=right) {
            int mid = (left + right)/2;
            if (matrix[mid][0]<=target) {
                res = mid;
            }
            if (matrix[mid][0]==target) return mid;
            if (matrix[mid][0]<target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return res;
    }
}
