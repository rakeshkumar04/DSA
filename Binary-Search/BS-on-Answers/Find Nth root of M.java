class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            int ans1 = FindRoot(mid,n,m);
            
            if(ans1 == 1){
                return mid;
            }
            else if(ans1 == 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static int FindRoot(int mid, int n, int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans = ans * mid;
            if(ans > m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }
    
}
