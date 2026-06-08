class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums: number[]): number {
        let maxOnes = 0, count=0;
        for(const num of nums){
            count = num===1? count+1:0;
            maxOnes = Math.max(maxOnes, count);
        }
        return maxOnes;
    }
}
