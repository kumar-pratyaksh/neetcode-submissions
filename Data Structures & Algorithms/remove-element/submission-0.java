class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int num: nums){
            if(num != val){
                nums[i] = num;
                i=i+1;
            }
        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }
        return i;
    }
}