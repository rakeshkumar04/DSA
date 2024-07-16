class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            maxi=Math.max(weights[i],maxi);
            sum+=weights[i];
        }
        int low = maxi;
        int high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            int daysReq = calcDays(weights,mid);
            if(daysReq<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static int calcDays(int[] weights, int cap){
        int n = weights.length;
        int days = 1;
        int load = 0;
        for(int i=0;i<n;i++){
            if(weights[i]+load > cap){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}
