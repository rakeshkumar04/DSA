class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long low = 1;
		long high = x;
		long ans = -1;
		
		while(low<=high){
		    long mid = (low+high)/2;
		    
		    if(mid*mid <= x){
		        ans = mid;
		        low = mid + 1;
		    }
		    else{
		        high = mid - 1;
		    }
		}
		return ans;
	 }
}
