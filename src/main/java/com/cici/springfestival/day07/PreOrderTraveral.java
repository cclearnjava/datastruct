package com.cici.springfestival.day07;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraveral {

    public List<Integer> preOrderTraveral(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    /**
     * 前序遍历(中左右）  递归法
     *
     * @param root
     * @param result
     */
    private void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }


    /**
     * 后续遍历（左右中） 递归法
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, List<Integer> res) {

        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }


    /**
     * 中序遍历 （左中右） 递归法
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inOrder(root, res);
        return res;
    }

    private void inOrder(TreeNode root, List<Integer> res) {

        if (root == null) {
            return;
        }
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }


}
