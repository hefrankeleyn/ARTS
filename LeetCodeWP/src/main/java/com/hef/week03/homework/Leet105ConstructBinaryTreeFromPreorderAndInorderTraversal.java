package com.hef.week03.homework;

import java.util.*;
/**
 * @Date 2021/4/18
 * @Author lifei
 */
public class Leet105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return createTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length);
    }

    private TreeNode createTree(int[] preorder, int[] inorder, int pre_index_begin, int pre_index_end, int in_index_begin, int in_index_end) {
        if (pre_index_begin > pre_index_end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre_index_begin]);

        Integer left_in_index = indexMap.get(preorder[pre_index_begin]);
        int left_num = left_in_index - in_index_begin;

        root.left = createTree(preorder, inorder, pre_index_begin + 1, pre_index_begin + left_num, in_index_begin, left_in_index-1);
        root.right = createTree(preorder, inorder, pre_index_begin + left_num + 1, pre_index_end, left_in_index + 1, in_index_end);

        return root;
    }
}
