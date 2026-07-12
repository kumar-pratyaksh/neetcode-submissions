class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        boolean result = false;
        for(int n : nums) {
            if(hash.contains(n)) {
                result = true;
                break;
            }
            hash.add(n);
        }
        return result;
    }
}