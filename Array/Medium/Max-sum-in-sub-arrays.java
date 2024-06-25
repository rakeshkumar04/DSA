class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        
        long s =0;
        long m =0;
        
        for(int i =0;i<N-1;i++){
            
            s=arr[i]+arr[i+1];
            m=Math.max(s,m);
        }
        return m;
    }
}
