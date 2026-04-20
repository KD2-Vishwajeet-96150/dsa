package com.sunbeam;

public class assi7_1 {

    // Make TreeNode static so it works inside static context cleanly
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {

        if (node == null) return true;

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val)
            && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {

        assi7_1 sol = new assi7_1();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(sol.isValidBST(root)); // true
    }
}