class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int a = nums[i];
            int b = target - a;
            
            if(mpp.containsKey(b)){
                int j=mpp.get(b);
                return new int[]{j,i};
            }
            mpp.put(a,i);
        }
        
        
        return new int[]{};
    }
}
