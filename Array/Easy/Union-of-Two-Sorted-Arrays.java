class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0;
        int j=0;
        
        ArrayList<Integer> union = new ArrayList<Integer>();
        
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(union.size()==0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!= arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        
        while(j<m){
            
            if(union.size()==0 || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
            
        }
        
        while(i<n){
            
            if(union.size()==0 || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
            
            
        }
        return union;
    }
}
