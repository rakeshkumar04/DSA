class Solution {
    public void rotate(int[] nums, int k) {
        int d = k % nums.length;
        int n = nums.length;
        reverse(nums,0,n-d-1);
        reverse(nums,n-d,n-1);
        reverse(nums,0,n-1);
        
    }
    
    static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
