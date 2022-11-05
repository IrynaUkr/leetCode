package medium.tasks;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidNode {
    public static boolean isValidBST(TreeNode root) {
        boolean isValid = true;

        Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();

        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()) {
            int parentVal = treeNodeQueue.peek().val;

            if (treeNodeQueue.peek().left != null) {

                if (parentVal <= treeNodeQueue.peek().left.val) {
                    isValid = false;
                    break;
                } else {
                    treeNodeQueue.offer(treeNodeQueue.peek().left);
                }
            }
            if (treeNodeQueue.peek().right != null) {
                if (parentVal >= treeNodeQueue.peek().right.val) {
                    isValid = false;
                    break;
                } else {
                    treeNodeQueue.offer(treeNodeQueue.peek().right);
                }
            }
            treeNodeQueue.poll();

        }
        return isValid;
    }

    public static boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

    public static boolean isVal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        if (root==null){
            return true;
        }
        TreeNode previous= null;
        while(root!=null || !stack.isEmpty()){

            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(previous!=null && previous.val > root.val){
                return false;
            }
            previous =root;
            root = root.right;
        }
         return true;
    }

    public static void main(String[] args) {
        TreeNode n11 = new TreeNode(110, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n4 = new TreeNode(4, n3, n5);
        TreeNode n8 = new TreeNode(8, n7, n11);
        TreeNode n6 = new TreeNode(8, n4, n8);

        boolean validBST = isVal(n6);
        System.out.println(validBST);


    }

}
