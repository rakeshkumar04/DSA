class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        
        int first = firstOccur(arr,n,x);
        if(first== -1){
            return 0;
        }
        
        int last = lastOccur(arr,n,x);
        
        return last-first+1;
        
    }
    
    int lastOccur(int[] nums,int n ,int target){
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }

    int firstOccur(int[] nums,int n ,int target){
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid -1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }
}
