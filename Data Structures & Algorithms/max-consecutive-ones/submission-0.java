class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int i = 0;
        while(i < nums.length){
            int count = 0;
            if(nums[i] == 1){
                do{
                    count++;
                    i++;
                }while(i< nums.length && nums[i]==1);
            }
            answer = Math.max(answer, count);
            i++;
        }
        return answer;
    }
}