package easy.tasks;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;

        for(int number: nums){
            rightSum += number;
        }

        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }else{
                leftSum += nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //[-1,-1,-1,-1,-1,0]
        int [] negativeArr = new int[]{2,1,-1};
        int i = pivotIndex(negativeArr);
        System.out.println(i);
    }
}
