class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return mergesort(arr,0,n-1);
    }
    
    static long mergesort(long arr[], int low, int high){
        long cnt = 0;
        if(low>=high) return cnt;
        int mid = (low+high)/2;
        cnt+=mergesort(arr,low,mid);
        cnt+=mergesort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        
        return cnt;
    }
    
    static long merge(long arr[], int low, int mid, int high){
        ArrayList<Long> temp = new ArrayList<>();
        long cnt = 0;
        int left = low;
        int right = mid+1;
        
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
                cnt+=(mid-left+1);
            }
        }
        
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
        
        return cnt;
        
    }
}
