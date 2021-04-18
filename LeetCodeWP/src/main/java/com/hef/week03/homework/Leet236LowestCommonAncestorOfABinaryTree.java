package com.hef.week03.homework;

/**
 * @Date 2021/4/18
 * @Author lifei
 */
public class Leet236LowestCommonAncestorOfABinaryTree {

    class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null || p==null || q==null || p==root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left==null && right==null) {
            return null;
        }else if (left!=null && right!=null) {
            return root;
        }else if (left==null && right!=null) {
            return right;
        }else {
            return left;
        }
    }
}
