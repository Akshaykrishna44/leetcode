class Solution {
    public int reversePairs(int[] nums) {
        int reversePairscount=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > 2*(long)nums[j])reversePairscount++;
            }
        }
        return reversePairscount;
    }
}
