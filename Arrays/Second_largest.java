class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] > secondlarge && nums[i] != largest){
                secondlarge = nums[i];
            }
        }

         if (secondlarge == Integer.MIN_VALUE) {
            return largest;
        }
        
        return secondlarge;
    }
}
