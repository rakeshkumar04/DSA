class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        if(n > threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int low = 1;
        int high = maxi;
        while(low<=high){
            int mid = (low+high)/2;
            if(sumOf(nums,mid)<=threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int sumOf(int[]arr,int val){
        int n=arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=Math.ceil((double)arr[i]/(double)val);
        }
        return sum;
    }
}
