class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] answer = new int[length];
        answer[length-1]=-1;
        int maxTillNow = arr[length-1];
        for(int i = length-2; i>=0; i--){
            answer[i] = maxTillNow;
            maxTillNow = Math.max(maxTillNow, arr[i]);
        }
        return answer;
    }
}