package com.example.leetcode.symmetricTree;

/**
 * Created by wyb on 2018/11/8.
 */
public class SymmetricTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        boolean result = new SymmetricTree().isSymmetric(root);
        System.out.println(result);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val == right.val) {
            return check(left.left, right.right) && check(left.right, right.left);
        } else {
            return false;
        }
    }
}
