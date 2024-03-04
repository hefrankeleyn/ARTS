package com.hef.week03;

/**
 * @Date 2021/4/18
 * @Author lifei
 */
public class Leet297SerializeAndDeserializeBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        int depth = searchMaxDepth(root, 0);
        int maxSize = maxSize(depth);
        Integer[] a  = new Integer[maxSize+1];
        fillValue(a, 1, root);
        return aToStr(a);
    }

    private String aToStr(Integer[] a) {
        String res = "";
        for (int i=0;i<a.length; i++) {
            if (i>0) {
                res+= ",";
            }
            res += a[i];
        }
        return res;
    }

    private void fillValue(Integer[] a, int i, TreeNode root) {
        if (root==null) return;
        a[i] = root.val;
        fillValue(a, i*2, root.left);
        fillValue(a, i*2+1, root.right);
    }

    private int maxSize(int depth) {
        int size = 0;
        for (int i=0; i<depth; i++) {
            size += (int)Math.pow(2, i);
        }
        return size;
    }

    private int searchMaxDepth(TreeNode root, int depth) {
        if (root==null) {
            return depth;
        }
        depth++;
        int leftDepth = searchMaxDepth(root.left, depth);
        int rightDepth = searchMaxDepth(root.right, depth);
        return Math.max(leftDepth, rightDepth);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data==null || data.equals("")) return null;
        String[] a = data.split(",");
        TreeNode root = createTreeNode(a, 1);
        return root;
    }

    private TreeNode createTreeNode(String[] a, int i) {
        if (i>=a.length || a[i].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(a[i]));
        root.left = createTreeNode(a, i*2);
        root.right = createTreeNode(a, i*2+1);
        return root;
    }
}
