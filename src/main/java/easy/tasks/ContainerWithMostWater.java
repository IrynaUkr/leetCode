package easy.tasks;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int k = 1; k < height.length; k++) {
                int currentLength = k - i;
                int currentHeight = Math.min(height[i], height[k]);
                int currentArea = currentHeight * currentLength;
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }

    public static int maxAreaFaster(int[] height) {
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        while (leftIndex < rightIndex) {
            int currentLength = rightIndex - leftIndex;
            int currentHeight = Math.min(height[rightIndex], height[leftIndex]);
            int currentArea = currentHeight * currentLength;
            maxArea = Math.max(maxArea, currentArea);
            //the longest length is leftIndex - rightIndex
            //we need to find the highest combination of heights
            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] example = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxAreaFaster(example));
    }
}
