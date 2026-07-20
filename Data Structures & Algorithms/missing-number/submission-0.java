class Solution {
    public int missingNumber(int[] nums) {
        int z = nums.length;
        int k = 0;
        int sum = z * (z+1)/2;
        for(int i = 0;i<z;i++){
         k +=nums[i];
            if(k==sum){
                return 0;
            }

        }
        return sum-k;
        
    }
}
