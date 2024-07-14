class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int totalHour = findTotalHours(piles,mid);
            
            if(totalHour <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int findTotalHours(int[] arr,int mid){
        int totalHours = 0;
        for(int i=0;i<arr.length;i++){
            totalHours += Math.ceil((double)arr[i]/(double)mid);
        }
        return totalHours;
    }

    public static int findMax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
