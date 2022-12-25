package easy.tasks;

//https://leetcode.com/problems/min-cost-climbing-stairs/?envType=study-plan&id=level-1
public class MinCost {
    public static int minCost(int[] costs) {
        for (int i = 2; i < costs.length; i++) {
            costs[i] += Math.min(costs[i - 2], costs[i]);
        }
        return Math.min(costs[costs.length - 1], costs[costs.length - 2]);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int a = minCost(arr);
        System.out.println(a);
    }

}
