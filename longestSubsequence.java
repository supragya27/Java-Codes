class Solution {
    public int lengthOfLongestSubsequence(String s) {
        int n=s.length();
        if(n==0) return n;
        
        int maxlt=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    break;
                if(j==i-1)
                    maxlt++;
            }
        }
        
        return maxlt;
    }
}