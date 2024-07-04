class Solve {
    
    int floor(int[] arr, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans = arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
    int ceil(int[] arr, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = arr[mid];
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        
        Arrays.sort(arr);
        // code here
        
        int floorVal = floor(arr,n,x);
        int ceilVal = ceil(arr,n,x);
        
        Pair ans = new Pair(floorVal,ceilVal);
        
        return ans;
    }
}
