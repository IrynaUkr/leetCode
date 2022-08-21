package easy.tasks;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
      int uniqueIndex = 1;
      for(int i = 1; i < nums.length; i++){
          //if numbers are different we continue iterating
          // if they are not we change only current index, but unique index does not change
          // when we met next unique number we put it in the place with only unique numbers
          // and continue this operating with every member
          if(nums[i] != nums[i-1]){
              nums[uniqueIndex]= nums[i];
              uniqueIndex++;
          }
      }
       return uniqueIndex;
    }
}
