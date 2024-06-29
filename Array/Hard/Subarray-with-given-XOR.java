public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        HashMap<Integer,Integer>mpp = new HashMap<>();

        int xor=0;
        int count=0;
        mpp.put(0,1);

        for(int i=0;i<n;i++){
            xor=xor^A.get(i);
            int rem=xor^B;
            count+=mpp.getOrDefault(rem,0);
            mpp.put(xor,mpp.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
