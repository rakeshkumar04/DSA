class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0; i<n;i++){
            boolean leader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    
}
