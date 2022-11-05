package medium.tasks;
//https://leetcode.com/problems/binary-tree-level-order-traversal/discuss/2274598/C%2B%2B-or-PYTHON-or-JAVA-or-EXPLAINED-oror


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TreeNodeTravers {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> answer = new LinkedList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
         if (root==null){
             return  answer;
         }

        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()) {
            List<Integer> valuesCurrentLevel = new LinkedList<>();
            int amountNodes = valuesCurrentLevel.size();
            for(int i =0; i< amountNodes; i++){
                if(treeNodeQueue.peek().left!= null){
                    treeNodeQueue.offer(treeNodeQueue.peek().left);
                }if(treeNodeQueue.peek().right != null){
                    treeNodeQueue.offer(treeNodeQueue.peek().right);
                }
                int parentValue = treeNodeQueue.poll().val;
                valuesCurrentLevel.add(parentValue);
            }
            answer.add(valuesCurrentLevel);
        }
        return answer;
    }
}

