class Solution {
    public int characterReplacement(String s, int k){
        int[] count = new int[26]; 
        
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            int rightCharIdx = s.charAt(right) - 'A';
            count[rightCharIdx]++;
            
            // 2. Update the highest frequency seen in the current window
            maxFreq = Math.max(maxFreq, count[rightCharIdx]);
            
            // 3. Check if the window is invalid
            // (Length of window - max frequency > k)
            if ((right - left + 1) - maxFreq > k) {
                // The window is invalid, shrink it from the left
                int leftCharIdx = s.charAt(left) - 'A';
                count[leftCharIdx]--;
                left++;
            }
            
            // 4. Update the maximum length of a valid window found so far
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
