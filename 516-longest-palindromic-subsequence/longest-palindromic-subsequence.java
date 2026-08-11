class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        
        
        for (int i = n - 2; i >= 0; i--) {
            int prevDiag = 0; 
            for (int j = i + 1; j < n; j++) {
                int temp = dp[j]; 
                
                if (s.charAt(i) == s.charAt(j)) {
                    
                    dp[j] = prevDiag + 2;
                } else {
                  
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                
                prevDiag = temp; 
            }
        }
        
        return dp[n - 1];
    }
}
