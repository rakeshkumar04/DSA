class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        
        for (int num : nums) {
            if (num == el1) {
                cnt1++;
            } else if (num == el2) {
                cnt2++;
            } else if (cnt1 == 0) {
                el1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                el2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == el1) {
                cnt1++;
            } else if (num == el2) {
                cnt2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int mini = n / 3;

        if (cnt1 > mini) {
            ans.add(el1);
        }
        if (cnt2 > mini) {
            ans.add(el2);
        }

        return ans;
    }
}
