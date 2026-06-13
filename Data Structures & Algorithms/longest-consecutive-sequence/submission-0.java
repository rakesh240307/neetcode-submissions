class Solution {
    public int longestConsecutive(int[] nums) {
        int a = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int z = 1;
        
        if(nums.length==0){
            return 0;
        }
        for(int i = 1 ; i<a;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
                 z = Math.max(z,count);
            }
            else{
                count = 1;
            }
        }
        return z;
        
    }
}
