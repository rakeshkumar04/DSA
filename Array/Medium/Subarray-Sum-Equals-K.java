class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp = new HashMap<>();

        int sum=0;
        int count=0;
        mpp.put(0,1);

        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            int rem=sum-k;
            count+=mpp.getOrDefault(rem,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
